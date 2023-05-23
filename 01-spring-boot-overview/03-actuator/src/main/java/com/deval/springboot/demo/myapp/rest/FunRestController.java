package com.deval.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${custom.fname}")
    private String fName;

    @Value("${custom.lname}")
    private String lName;
    @GetMapping("/")
    public String sayHello(){
        return "Hello worlds !" + fName + " " + lName;
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Hello Bye !";
    }
}
