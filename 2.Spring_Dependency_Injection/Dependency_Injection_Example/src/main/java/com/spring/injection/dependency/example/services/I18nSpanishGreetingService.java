package com.spring.injection.dependency.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayHiToEveryone() {
        return "Hola perro! - ES";
    }
}
