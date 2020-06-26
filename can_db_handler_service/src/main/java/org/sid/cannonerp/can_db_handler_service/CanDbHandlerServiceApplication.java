package org.sid.cannonerp.can_db_handler_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient


public class CanDbHandlerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanDbHandlerServiceApplication.class, args);
    }

}
