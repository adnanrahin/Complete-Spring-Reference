package com.spring.ioc.xml_config;

public class BaseBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Baseball Coach: Practice batting everyday for 2 hours";
    }
}
