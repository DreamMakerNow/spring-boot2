package com.day01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// DATE: 2021/3/13-16:32  Happy Every Day
//@SpringBootConfiguration

@RestController
public class hello {
    @RequestMapping("/hello")
    String hi(){
        return "hello spring boot2!";
    }
}
