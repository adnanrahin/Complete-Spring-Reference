package com.spring.ioc.xml_config;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Track Coach Run at least 30 minutes a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
