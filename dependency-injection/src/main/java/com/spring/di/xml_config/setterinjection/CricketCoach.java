package com.spring.di.xml_config.setterinjection;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {

    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket Coach: Bowl at least 10 overs a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
