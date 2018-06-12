package com.test.spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
//使用注解被拦截类
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
