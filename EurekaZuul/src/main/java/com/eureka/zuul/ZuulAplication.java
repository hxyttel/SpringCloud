package com.eureka.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// 包含了@EnableZuulServer注解,设置该类是网关的启动类
@EnableZuulProxy
// 可以帮助Spring boot 应用将所有符合条件的@Configuration配置加载到当前Springbootc创建并使用ioc容器中
@EnableAutoConfiguration
public class ZuulAplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulAplication.class,args);
    }
}
