package com.spring.config.bean_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach baseBallCoach = context.getBean("baseBallCoach", Coach.class);

        System.out.println(baseBallCoach.getDailyWorkout());

        System.out.println(baseBallCoach.getDailyFortune());

        context.close();

    }
}
