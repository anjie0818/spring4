package com.test.spring4.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService service = context.getBean(AwareService.class);
        service.outputResult();
    }
}
