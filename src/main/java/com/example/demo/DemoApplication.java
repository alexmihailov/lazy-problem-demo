package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(DemoApplication.class, args);
        var repository = ctx.getBean(SlaveEntityRepository.class);

        var values = repository.findAll();
        for (var value : values) {
            System.out.println(value);
        }
    }
}
