package com.spring.ioc.xml_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "bean-scope-application-context.xml");

        Coach coach = context.getBean("trackCoach", Coach.class);

        Coach coach1 = context.getBean("trackCoach", Coach.class);

        System.out.println(coach.equals(coach1));

        Coach baseBallCoach = context.getBean("baseBallCoach", Coach.class);

        System.out.println(baseBallCoach.getDailyWorkout());
        System.out.println(baseBallCoach.getDailyFortune());

        context.close();

    }
}
