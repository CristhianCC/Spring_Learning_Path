package com.spring.injection.dependency.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("RU")
@Service("i18nService")
public class I18nRomanianGreetingService implements GreetingService{
    @Override
    public String sayHiToEveryone() {
        return "Salut scuze - RU";
    }
}
