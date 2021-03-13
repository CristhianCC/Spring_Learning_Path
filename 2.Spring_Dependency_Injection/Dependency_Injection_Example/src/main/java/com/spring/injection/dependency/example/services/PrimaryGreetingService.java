package com.spring.injection.dependency.example.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayHiToEveryone() {
        return "Regular Hi - Primary";
    }
}
