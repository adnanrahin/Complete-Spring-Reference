package com.spring.di.setterinjection;

public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is a random Fortune Service";
    }
}
