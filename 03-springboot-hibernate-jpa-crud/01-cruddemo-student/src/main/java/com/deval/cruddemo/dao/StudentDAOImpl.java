package com.deval.cruddemo.dao;

import com.deval.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student student) {
            this.entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return this.entityManager.find(Student.class,1);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> fromStudent = this.entityManager.createQuery("FROM Student", Student.class);
        return fromStudent.getResultList();
    }

    @Override
    public List<Student> sortByFirstName() {
        TypedQuery<Student> byLastName = this.entityManager.createQuery("FROM Student order by firstName desc", Student.class);
        return byLastName.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        this.entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student student = this.entityManager.find(Student.class, id);
        this.entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int deleteFromStudent = this.entityManager.createQuery("DELETE from Student").executeUpdate();
        return deleteFromStudent;
    }


}
