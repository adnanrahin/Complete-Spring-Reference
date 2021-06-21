package com.spring.config.component_config;

public class SadFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "This is sad Fortune Service";
    }
}
