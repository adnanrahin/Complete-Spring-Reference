package com.spring.ioc.xml_config;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "BaseBall Coach: Do batting practice for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }

    public void doStartUpConfig(){
        System.out.println("It will do all the startup configuration");
    }

    public void doDestroyConfig(){
        System.out.println("It will Destroy Everything");
    }

}
