package com.ApplicationEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        DemoPublisher  demoPublisher = annotationConfigApplicationContext.getBean(DemoPublisher.class);
        demoPublisher.publish("Hello go damn !");
        annotationConfigApplicationContext.close();
    }
}
