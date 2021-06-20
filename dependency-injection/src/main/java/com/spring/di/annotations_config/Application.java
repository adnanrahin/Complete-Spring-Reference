package com.spring.di.annotations_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("annotations-constructor-dependency-injection-context.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyFortune());
        System.out.println(tennisCoach.getDailyWorkout());

        context.close();

    }

}
