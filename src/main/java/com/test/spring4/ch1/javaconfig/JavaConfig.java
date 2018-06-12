package com.test.spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//声明一个配置类
@Configuration
public class JavaConfig {
    //Bean注解在当前方法上，返回值是一个bean
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        //在spring容器中只要存在一个bean都可以在另一个bean的声明方法中作为参数注入
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
}
