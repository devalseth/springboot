package com.demo.cruddemo.controller;

import com.demo.cruddemo.dao.EmployeeDAO;
import com.demo.cruddemo.dao.EmployeeDAOJpaImpl;
import com.demo.cruddemo.entities.Employee;
import com.demo.cruddemo.service.EmployeeService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    private List<Employee> findEmployee(){
      return employeeService.findAll();
    }

    @GetMapping("/employee/{id}")
    private Employee findEmployeeById(@PathVariable int id){
        Employee employee = employeeService.findById(id);
        if(employee == null){
            throw new RuntimeException("Employee id not found " + id);
        }
        return employee;
    }

    @PostMapping("/employee")
    private Employee addEmployee(@RequestBody Employee emp){
        emp.setId(0);
        return employeeService.save(emp);
    }

    @DeleteMapping("/employee/{id}")
    private String deleteEmployee(@PathVariable int id){
        Employee employee = employeeService.findById(id);
        if(employee ==  null){
            throw new RuntimeException("Employee does not exist with ID " + id);
        }
        employeeService.deleteById(id);
        return "Employee deleted having ID " + id;
    }

    @PutMapping("/employee")
    private Employee findEmployeeById(@RequestBody Employee emp){
        return employeeService.save(emp);
    }
}
