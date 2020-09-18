package com.it.demo.spring.framework;

import com.it.demo.spring.framework.configure.DemoConfiguration;
import com.it.demo.spring.framework.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(DemoConfiguration.class);
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        System.out.println(person);
    }
}
