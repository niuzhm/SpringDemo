package com.it.demo.spring.framework.configure;

import com.it.demo.spring.framework.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {
    @Bean
    public Person person(){
        Person person = new Person();
        person.setAge(2);
        person.setName("Yee");
        person.setSex("Male");
        return person;
    }
}
