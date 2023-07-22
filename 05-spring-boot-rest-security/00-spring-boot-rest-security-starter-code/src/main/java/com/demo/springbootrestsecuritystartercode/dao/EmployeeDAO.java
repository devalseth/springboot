package com.demo.springbootrestsecuritystartercode.dao;

import com.demo.springbootrestsecuritystartercode.entities.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    void deleteById(Integer employeeId);

    Employee save(Employee employee);

}
