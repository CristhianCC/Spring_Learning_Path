package com.spring.injection.dependency.example;

import com.spring.injection.dependency.example.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(ExampleApplication.class, args);

		MyController myController = (MyController) appCtx.getBean("myController");

		String greet = myController.sayHiToEveryone();

		System.out.println(greet);
	}

}
