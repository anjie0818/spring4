package com.test.spring4.ch3.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@ComponentScan("com.test.spring4.ch3.taskexecutor")
@EnableAsync  //开启对异步任务的执行
public class TaskExecutorConfig implements AsyncConfigurer{
//    获取线程池
    @Override
    public Executor getAsyncExecutor() {//实现AsyncConfigurer接口，重写getAsyncExecutor，获得一个基于线程池的TaskExecutor(任务执行器)
        ThreadPoolTaskExecutor taskExecutor =new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
