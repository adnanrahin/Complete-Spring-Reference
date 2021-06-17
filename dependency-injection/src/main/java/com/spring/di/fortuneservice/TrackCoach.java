package com.spring.di.fortuneservice;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Track Coach: Run in track for 30 minutes Dependency Injection";
    }
}
