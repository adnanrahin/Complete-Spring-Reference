package com.spring.ioc.annotations_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotations-application-context.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());

        context.close();

    }

}
