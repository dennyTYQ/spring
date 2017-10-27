package com.springel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig resourceService = context.getBean(ELConfig.class);
        resourceService.outputSource();
        context.close();
    }
}
