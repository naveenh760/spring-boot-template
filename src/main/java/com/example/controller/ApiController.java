package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello-controller")
    public String sayHello() {
        return "Hello, Spring MVC!";
    }
}

