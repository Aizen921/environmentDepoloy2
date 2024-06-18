package com.environmentDeploy2.environmentDepoloy2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloController {
    @Autowired
    private Environment environment;
    @Value("${welcomeMsg}")
    private String hello;
    @GetMapping
    public String sayHello(){
        return hello;
    }
}
