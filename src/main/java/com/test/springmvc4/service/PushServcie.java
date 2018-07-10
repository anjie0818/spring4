package com.test.springmvc4.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

@Service
public class PushServcie {
    private DeferredResult<String> deferredResult;//产生result给客户端使用
    public DeferredResult<String> getAsyncUpdate(){
        deferredResult =new DeferredResult<String>();
        return deferredResult;
    }
    @Scheduled(fixedDelay = 5000)
    public void refresh(){
        if (deferredResult!=null){
            deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
        }
    }
}
