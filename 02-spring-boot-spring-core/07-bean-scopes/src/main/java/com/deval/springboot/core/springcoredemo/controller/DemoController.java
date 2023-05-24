package com.deval.springboot.core.springcoredemo.controller;

import com.deval.springboot.core.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach1;
    private Coach coach2;

    DemoController(){
        super();
        System.out.println("Constructor : Inside DemoController");
    }

    @Autowired
    private void setCoah(@Qualifier("cricketCoach") Coach coach1, @Qualifier("cricketCoach") Coach coach2){
        this.coach1 = coach1;
        this.coach2 = coach2;
        System.out.println("setCoach Method : Inside DemoController");
    }

    @GetMapping("/getBeanScope")
    public String getDailyWorkout(){
        if(coach1 == coach2){
            return "Singleton Bean";
        }else{
            return "Prototype Bean";
        }
    }
}
