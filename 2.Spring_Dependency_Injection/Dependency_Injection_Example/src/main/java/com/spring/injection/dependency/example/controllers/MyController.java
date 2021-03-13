package com.spring.injection.dependency.example.controllers;

import com.spring.injection.dependency.example.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHiToEveryone() {
        return this.greetingService.sayHiToEveryone();
    }
}
