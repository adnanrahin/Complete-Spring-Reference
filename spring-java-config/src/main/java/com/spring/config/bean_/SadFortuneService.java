package com.spring.config.bean_;

public class SadFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "This is sad Fortune Service";
    }
}
