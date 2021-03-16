package com.spring.injection.dependency.example.controllers;

import com.spring.injection.dependency.example.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    // Best way to inject a bean
    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void greet() {
        System.out.println(this.constructorInjectedController.greet());
    }
}