package com.spring.config;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    

    @Override
    public String getDailyWorkout() {
        return "BaseBall Coach: BaseBall Coach Implementations";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
