package com.spring.di.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("setter-dependency-injection-context.xml");

        Coach cricketCoach = context.getBean("cricketCoach", Coach.class);

        System.out.println(cricketCoach.getDailyWorkout());

        System.out.println(cricketCoach.getDailyFortune());

        context.close();
    }
}
