package com.spring.config.component_config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach swimCoach = context.getBean("swimCoach", Coach.class);

        System.out.println(swimCoach.getDailyWorkout());

        System.out.println(swimCoach.getDailyFortune());

        context.close();

    }
}
