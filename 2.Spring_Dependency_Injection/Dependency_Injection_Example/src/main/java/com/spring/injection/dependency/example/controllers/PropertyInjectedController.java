package com.spring.injection.dependency.example.controllers;


import com.spring.injection.dependency.example.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String greet() {
        return this.greetingService.sayHiToEveryone();
    }
}
