package com.example.demo;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JPAPractice1 {

    public static void main(String[] args) {
        SpringApplication.run(JPAPractice1.class, args);
    }
    @Bean
    Hibernate5Module hibernate5Module(){
        return new Hibernate5Module();
    }
}
