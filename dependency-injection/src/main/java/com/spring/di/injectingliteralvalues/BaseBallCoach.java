package com.spring.di.injectingliteralvalues;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    private String email;
    private String teamName;

    public BaseBallCoach() {

    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball Coach: Practice batting for 20 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
