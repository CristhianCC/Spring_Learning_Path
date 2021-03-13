package com.spring.injection.dependency.example;

import com.spring.injection.dependency.example.controllers.ConstructorInjectedController;
import com.spring.injection.dependency.example.controllers.MyController;
import com.spring.injection.dependency.example.controllers.PropertyInjectedController;
import com.spring.injection.dependency.example.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(ExampleApplication.class, args);

		MyController myController = (MyController) appCtx.getBean("myController");

		System.out.println("--------- Primary");
		System.out.println(myController.sayHiToEveryone());

		System.out.println("--------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) appCtx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.greet());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) appCtx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.greet());

		System.out.println("--------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) appCtx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.greet());
	}

}
