package com.deval.springboot.core.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice for 5km of running daily";
    }
    RunningCoach(){
        System.out.println("Constructor : Inside Running Coach");
    }

}
