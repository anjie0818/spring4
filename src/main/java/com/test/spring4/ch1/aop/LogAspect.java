package com.test.spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect   //声明此类是一个切面
@Component  //将切面注入spring容器
//编写切面
public class LogAspect {
    //声明切点
    @Pointcut("@annotation(com.test.spring4.ch1.aop.Action)")
    public void annotationPointCut(){}
    //after声明一个建言，参数为拦截的切点
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        //通过反射获取注解上的属性，然后做日志记录相关操作
        System.out.println("注解式拦截 "+action.name());
    }
    //before声明一个建言，参数是拦截的规则
    @Before("execution(* com.test.spring4.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截，"+method.getName());
    }
}
