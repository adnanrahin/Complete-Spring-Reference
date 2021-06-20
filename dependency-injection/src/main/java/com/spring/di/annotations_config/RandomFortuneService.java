package com.spring.di.annotations_config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RandomFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "Random Fortune Service";
    }
}
