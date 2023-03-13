package com.example.Exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/ping")
    public String healthCheck(){
        return "pong";
    }

    @GetMapping("/hello")
    public String WelcomeToTheServer(){
        return "Hello world";
    }
}
