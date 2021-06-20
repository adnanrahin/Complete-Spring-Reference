package com.spring.di.annotations_config;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "This is Happy Fortune Service";
    }
}
