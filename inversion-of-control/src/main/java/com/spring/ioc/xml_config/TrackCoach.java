package com.spring.ioc.xml_config;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Track Coach: Run 30 Minutes Everyday";
    }

}
