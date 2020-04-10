package com.restTemplete;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTempletAplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTempletAplication.class);
    }

    /**
     * 引用RestTemplate可以访问其他端口的controll
     * */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
