package com.test.spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublistener demoPublistener=context.getBean(DemoPublistener.class);
        demoPublistener.publish("hello");
        context.close();

    }
}
