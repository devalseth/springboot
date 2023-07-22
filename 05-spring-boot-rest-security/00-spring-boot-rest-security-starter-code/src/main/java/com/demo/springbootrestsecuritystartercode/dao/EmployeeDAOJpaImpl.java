package com.demo.springbootrestsecuritystartercode.dao;

import com.demo.springbootrestsecuritystartercode.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> fromEmployee = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employeeList = fromEmployee.getResultList();
        return employeeList;
    }

    @Override
    public Employee findById(int id) {
       // Query findByIdQuery = entityManager.createQuery("from Employee where id =:employeeId");
       // return (Employee) findByIdQuery.getResultList().get(0);
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteById(Integer employeeId) {
        Employee employee = entityManager.find(Employee.class, employeeId);
        entityManager.remove(employee);
    }

    @Override
    public Employee save(Employee employee) {
        Employee emp = entityManager.merge(employee);
        return emp;
    }

}
