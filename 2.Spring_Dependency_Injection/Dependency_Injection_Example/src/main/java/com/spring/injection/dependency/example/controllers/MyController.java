package com.spring.injection.dependency.example.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHiToEveryone() {
        String greet = "Hi everyone!!!";

        System.out.println(greet);

        return greet;
    }
}
