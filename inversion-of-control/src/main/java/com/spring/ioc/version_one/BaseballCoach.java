package com.spring.ioc.version_one;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 20 minutes on batting practice";
    }

}
