package com.spring.di.xml_config.injectingliteralvalues;

public class PublicFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Public Fortune Service";
    }
}
