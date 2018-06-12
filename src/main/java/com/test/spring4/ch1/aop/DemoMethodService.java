package com.test.spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
//使用方法的被拦截类
public class DemoMethodService {
    @Action(name="method使用类action")
    public void add(){
        System.out.println("DeomMethodService的add方法");
    }
}
