package com.spring.injection.dependency.example.controllers;

import com.spring.injection.dependency.example.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    // This is now a private attribute
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return this.greetingService.sayHiToEveryone();
    }
}
