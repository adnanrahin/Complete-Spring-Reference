package com.spring.config.component_config;

import com.spring.config.bean_config.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "This is sad Fortune Service";
    }
}
