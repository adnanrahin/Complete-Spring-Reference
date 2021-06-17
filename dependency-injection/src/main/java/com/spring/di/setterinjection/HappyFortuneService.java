package com.spring.di.setterinjection;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This is Happy Fortune Service";
    }
}
