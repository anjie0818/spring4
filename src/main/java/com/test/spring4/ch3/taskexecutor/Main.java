package com.test.spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AsyncTaskService.class);
        AsyncTaskService server = context.getBean(AsyncTaskService.class);

        for(int i=0;i<10;i++){
            server.executeAsyncTask(i);
            server.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
