package com.test.spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


@Configuration
@ComponentScan("com.test.spring4.ch2.el")
@PropertySource(value = "classpath:/test.properties")

//注入配置文件
public class ElConfig {
    @Value("I love you")
    //注入普通字符串
    private String normal;//注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random()*100.0}")//注入表达式
    private String randomNumber;
    @Value("#{demoService.another}")//注入其他bean属性
    private  String fromAnother;
    @Value("classpath:/test.txt")//注入文件资源
    private Resource testFile;
    @Value("http://www.baidu.com")//注入网址
    private Resource testUrl;
    @Value("${book.name}")//注入配置文件
    private String bookName;
    @Bean//注入配置文件
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Autowired
    private Environment environment;
    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
