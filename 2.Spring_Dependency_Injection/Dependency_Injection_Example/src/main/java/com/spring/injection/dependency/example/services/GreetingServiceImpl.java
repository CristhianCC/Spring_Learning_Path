package com.spring.injection.dependency.example.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHiToEveryone() {
        return "Regular Hi";
    }
}
