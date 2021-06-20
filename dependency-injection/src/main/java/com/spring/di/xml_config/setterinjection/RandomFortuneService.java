package com.spring.di.xml_config.setterinjection;

public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is a random Fortune Service";
    }
}
