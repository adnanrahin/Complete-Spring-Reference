package com.spring.config.component_config;

import com.spring.config.bean_config.Coach;
import com.spring.config.bean_config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        com.spring.config.bean_config.Coach baseBallCoach = context.getBean("baseBallCoach", Coach.class);

        System.out.println(baseBallCoach.getDailyWorkout());

        System.out.println(baseBallCoach.getDailyFortune());

        context.close();

    }
}
