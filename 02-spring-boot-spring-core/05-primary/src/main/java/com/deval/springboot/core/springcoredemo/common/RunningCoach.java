package com.deval.springboot.core.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RunningCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice for 5km of running daily";
    }
}
