package com.spring.injection.dependency.example.controllers;


import com.spring.injection.dependency.example.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String greet() {
        return this.greetingService.sayHiToEveryone();
    }
}
