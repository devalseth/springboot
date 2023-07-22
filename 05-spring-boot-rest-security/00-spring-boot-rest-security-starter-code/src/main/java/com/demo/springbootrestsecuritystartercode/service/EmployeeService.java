package com.demo.springbootrestsecuritystartercode.service;

import com.demo.springbootrestsecuritystartercode.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void deleteById(Integer employeeId);

    Employee save(Employee employee);
}
