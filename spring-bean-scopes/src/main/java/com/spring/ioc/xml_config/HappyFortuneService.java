package com.spring.ioc.xml_config;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortuneService() {
        return "This is Happy Fortune Service";
    }
}
