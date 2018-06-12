package com.test.spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg=demoEvent.getMsg();
        System.out.println("listener 接收到自定义事件的消息："+msg);
    }
}
