package com.fstt.mediatech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.fstt.models")  // Explicitly scan the entity package

public class MediatechApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediatechApplication.class, args);
    }

}
