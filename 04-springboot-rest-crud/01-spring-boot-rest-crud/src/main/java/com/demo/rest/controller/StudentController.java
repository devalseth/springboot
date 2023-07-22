package com.demo.rest.controller;

import com.demo.rest.entities.Student;
import com.demo.rest.exceptions.StudentErrorResponse;
import com.demo.rest.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> studentList;

    @PostConstruct
    public void loadData(){
        studentList = new ArrayList<>();
        studentList.add(new Student(1,"Deval","Seth"));
        studentList.add(new Student(2,"Somel","Seth"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return this.studentList;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Integer id){
        if((id >= studentList.size()) || (id < 0 )){
            throw new StudentNotFoundException("Student id not foi=und - " + id);
        }
        return this.studentList.get(id);
    }

}
