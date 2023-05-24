package com.deval.springboot.core.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    CricketCoach(){
        System.out.println("Constructor : Inside Cricket Coach");
    }

    //init method
    @PostConstruct
    public void init(){
        System.out.println("Inside : After bean initialized " + this.getClass().getSimpleName());
    }

    //destroyed method
    @PreDestroy
    public void destroy(){
        System.out.println("Inside : Before bean destroyed " + this.getClass().getSimpleName());
    }
}
