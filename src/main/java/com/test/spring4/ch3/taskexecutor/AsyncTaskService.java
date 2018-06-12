package com.test.spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
    @Async//说明异步方法
    public void executeAsyncTask(Integer integer) throws InterruptedException {
        System.out.println("异步方法："+integer);
        if (integer==5) Thread.sleep(1000);
    }
    @Async
    public void executeAsyncTaskPlus(Integer integer){
        System.out.println("异步方法+1："+(integer+1));
    }

}
