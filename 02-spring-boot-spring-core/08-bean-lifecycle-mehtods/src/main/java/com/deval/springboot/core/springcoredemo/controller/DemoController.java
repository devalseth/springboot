package com.deval.springboot.core.springcoredemo.controller;

import com.deval.springboot.core.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach1;

    DemoController(){
        super();
    }

    @Autowired
    private void setCoah(@Qualifier("cricketCoach") Coach coach1){
        this.coach1 = coach1;
    }

    @GetMapping("/dailyWorkOut")
    public String getDailyWorkout(){
        return coach1.getDailyWorkout();
    }
}
