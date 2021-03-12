package com.spring.injection.dependency.example.controllers;

import com.spring.injection.dependency.example.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    // This is a setter injected controller, even it it's from a private attribute,
    // still not the best way to inject dependencies.
    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void greet() {
        System.out.println(this.setterInjectedController.greet());
    }
}