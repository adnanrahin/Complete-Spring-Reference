package com.spring.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HappyFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "Happy Fortune Service Implementation.";
    }
}
