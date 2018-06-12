package com.test.spring4.ch1.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//注解本身没有功能，是解释数据的数据，就是所谓的配置
//注解的功能来自于使用这个注解的地方
public @interface Action {
    String name();
}
