package com.deval.springboot.core.springcoredemo.controller;

import com.deval.springboot.core.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;

    DemoController(){
        super();
        System.out.println("Constructor : Inside DemoController");
    }

    @Autowired
    private void setCoah(@Qualifier("cricketCoach") Coach coach){
        this.coach = coach;
        System.out.println("setCoach Method : Inside DemoController");
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return this.coach.getDailyWorkout();
    }
}
