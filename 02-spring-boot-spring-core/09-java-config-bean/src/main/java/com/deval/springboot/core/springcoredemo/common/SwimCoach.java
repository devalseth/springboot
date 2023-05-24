package com.deval.springboot.core.springcoredemo.common;

import org.springframework.stereotype.Component;

public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Daily swim for 20 minutes";
    }
}
