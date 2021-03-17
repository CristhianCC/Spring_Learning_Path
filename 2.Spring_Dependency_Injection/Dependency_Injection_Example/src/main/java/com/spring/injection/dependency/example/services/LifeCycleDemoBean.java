package com.spring.injection.dependency.example.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("Constructor time!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("This is my factory set!!! " + beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("This is my fucking bean name !!! " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I'm being destroyed!!! HELP :(");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Where are my properties??? already set???????????");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Hello Context: " + applicationContext.toString());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct shit");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Before my end...");
    }

    public void beforeInit() {
        System.out.println("Before init - called By Bean Processor");
    }

    public void afterInit() {
        System.out.println("After init - called By Bean Processor");
    }
}
