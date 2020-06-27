package org.cannonerp.can_tiers_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TiersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiersServiceApplication.class, args);
    }

}
