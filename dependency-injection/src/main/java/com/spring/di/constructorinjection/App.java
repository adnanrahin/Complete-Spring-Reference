package com.spring.di.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dependency-injection-context.xml");

        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(trackCoach.getDailyWorkout());

        System.out.println(trackCoach.getDailyFortune());

        context.close();
    }
}
