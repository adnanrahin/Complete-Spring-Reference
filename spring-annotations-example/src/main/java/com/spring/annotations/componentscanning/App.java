package com.spring.annotations.componentscanning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.spring.annotations");
        context.refresh();

        MathComponent ms = context.getBean(MathComponent.class);

        int result = ms.add(1, 2);

        System.out.println(result);

        context.close();

    }
}
