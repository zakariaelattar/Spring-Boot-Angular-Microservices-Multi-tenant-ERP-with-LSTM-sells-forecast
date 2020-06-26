package org.cannonerp.can_product_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CanProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanProductServiceApplication.class, args);
    }

}
