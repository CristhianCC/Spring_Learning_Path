package com.spring.injection.dependency.example.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayHiToEveryone() {
        return "Regular Hi - Setter";
    }
}
