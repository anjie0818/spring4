package com.test.spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
    @Async//说明异步方法，这里的方法自动被注入ThreadPoolTaskExecutor作为TaskExecutor
    public void executeAsyncTask(Integer integer) throws InterruptedException {
        System.out.println("异步方法："+integer);
    }
    @Async
    public void executeAsyncTaskPlus(Integer integer){
        System.out.println("异步方法+1："+(integer+1));
    }

}
