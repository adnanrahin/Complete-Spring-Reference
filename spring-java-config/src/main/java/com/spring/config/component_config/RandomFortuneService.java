package com.spring.config.component_config;

import com.spring.config.bean_config.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "Random Fortune Service Implementations.";
    }
}
