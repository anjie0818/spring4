package com.test.spring4.ch2.prepost;

public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public void destory(){
        System.out.println("@Bean-destory-method");
    }
    public  BeanWayService(){
        System.out.println("初始化构造方法-BeanWayService");
    }
}
