package com.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("configClient")
public class ConfigClientController {


        @Value("${server.port}")
        public String port;

        @GetMapping("/index")
        public String index(){
            return this.port;
        }


}
