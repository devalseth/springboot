package com.demo.cruddemo.service;

import com.demo.cruddemo.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void deleteById(Integer employeeId);

    Employee save(Employee employee);
}
