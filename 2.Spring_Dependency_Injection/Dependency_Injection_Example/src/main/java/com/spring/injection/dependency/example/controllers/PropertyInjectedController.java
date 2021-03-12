package com.spring.injection.dependency.example.controllers;


import com.spring.injection.dependency.example.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String greet() {
        return this.greetingService.sayHiToEveryone();
    }
}
