package com.feign.service.impl;

import com.feign.entity.Student;
import com.feign.service.FeignProvideClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignErrorClient implements FeignProvideClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护中。。。。。";
    }
}
