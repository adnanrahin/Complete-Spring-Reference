package com.spring.di.xml_config.injectingliteralvalues;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Track Coach: Run in track for 30 minutes Dependency Injection";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
