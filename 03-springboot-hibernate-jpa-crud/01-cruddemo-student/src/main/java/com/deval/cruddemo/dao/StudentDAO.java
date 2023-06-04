package com.deval.cruddemo.dao;

import com.deval.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> sortByFirstName();

    void update(Student student);

    void delete(Integer id);

    int deleteAll();
}
