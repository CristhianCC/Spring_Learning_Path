package com.spring.injection.dependency.example.controllers;

import com.spring.injection.dependency.example.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return this.greetingService.sayHiToEveryone();
    }
}
