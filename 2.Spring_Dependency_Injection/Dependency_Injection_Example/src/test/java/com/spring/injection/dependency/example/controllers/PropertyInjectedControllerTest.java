package com.spring.injection.dependency.example.controllers;

import com.spring.injection.dependency.example.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    // This is a property injection, not the best way to use the dependency injection.
    @Test
    void getGreeting() {
        System.out.println(this.propertyInjectedController.greet());
    }
}