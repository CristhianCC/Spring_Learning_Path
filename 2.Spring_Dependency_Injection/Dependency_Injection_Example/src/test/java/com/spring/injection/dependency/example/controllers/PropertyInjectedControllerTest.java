package com.spring.injection.dependency.example.controllers;

import com.spring.injection.dependency.example.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new ConstructorInjectedGreetingService();
    }

    // This is a property injection, not the best way to use the dependency injection.
    @Test
    void getGreeting() {
        System.out.println(this.propertyInjectedController.greet());
    }
}