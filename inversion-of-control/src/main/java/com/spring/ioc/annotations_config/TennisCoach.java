package com.spring.ioc.annotations_config;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Tennis Coach: Practice Backhand Volley";
    }
}
