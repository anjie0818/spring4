package com.test.spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("JSR250-init-method");
    }
    public JSR250WayService(){
        System.out.println("初始化构造方法-JSR250WayService");
    }
    @PreDestroy
    public void destory(){
        System.out.println("JSR250-destroy-method");
    }
}
