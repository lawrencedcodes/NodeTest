package com.example.circuitbreakerbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class CircuitBreakerBookstoreApplication {

    @RequestMapping(value="/recommended")
    public String readingList() {
        return "Spring in Action(Manning), Cloud Native Java(O'Reilly), Learning Spring Boot(Packt)";
    }

    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakerBookstoreApplication.class, args);
    }
}