/*
package com.springscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService singletonService = annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService1 = annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        DemoPrototypeService prototypeService = annotationConfigApplicationContext.getBean(DemoPrototypeService.class);

        DemoPrototypeService prototypeService1 = annotationConfigApplicationContext.getBean(DemoPrototypeService.class);

        System.out.println("singletonService 是否与singletonService1相等：" + singletonService.equals(singletonService1));
        System.out.println("prototypeService 是否与prototypeService1相等：" + prototypeService.equals(prototypeService1));
        annotationConfigApplicationContext.close();

    }
}
*/
