package com.hystrix.service;


import com.hystrix.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

// 访问某个提供者“value =”是某个提供提供者的名字
@FeignClient(value = "provider")
@Service
public interface FeignProvideClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
