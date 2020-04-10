package com.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("configClient")
public class ConfigClientAction {

    @Value("${server.port}")
    public String port;

    @Value("${foo}")
    public String foo;

    @GetMapping("/index")
    public String index(){
        return this.port+"----"+this.foo;
    }
}
