package com.spring.di.injectingliteralvalues;

public class PublicFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Public Fortune Service";
    }
}
