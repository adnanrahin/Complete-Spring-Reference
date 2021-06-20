package com.spring.di.xml_config.injectingliteralvalues;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("literal-dependency-injection-context.xml");

        BaseBallCoach baseBallCoach = context.getBean("baseBallCoach", BaseBallCoach.class);

        System.out.println(baseBallCoach.getDailyWorkout());

        System.out.println(baseBallCoach.getDailyFortune());

        System.out.println(baseBallCoach.getEmail());

        System.out.println(baseBallCoach.getTeamName());

        context.close();
    }
}
