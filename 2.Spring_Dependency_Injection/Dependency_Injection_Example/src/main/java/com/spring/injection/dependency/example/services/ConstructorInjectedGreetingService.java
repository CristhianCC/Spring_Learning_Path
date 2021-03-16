package com.spring.injection.dependency.example.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayHiToEveryone() {
        return "Regular Hi - Constructor";
    }
}
