package com.deval.springboot.core.springcoredemo;

import org.springframework.stereotype.Component;

@Componentf
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
