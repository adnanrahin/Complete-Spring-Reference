package com.spring.di.xml_config.setterinjection;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This is Happy Fortune Service";
    }
}
