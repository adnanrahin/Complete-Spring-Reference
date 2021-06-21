package com.spring.config.bean_;

import com.spring.config.component_.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "Random Fortune Service Implementations.";
    }
}
