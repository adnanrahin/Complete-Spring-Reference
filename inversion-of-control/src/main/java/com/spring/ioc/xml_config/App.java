package com.spring.ioc.xml_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(trackCoach.getDailyWorkout());

        Coach baseBallCoach = context.getBean("baseBallCoach", Coach.class);

        System.out.println(baseBallCoach.getDailyWorkout());

        context.close();

    }
}
