package org.cannonerp.can_config_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CanConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanConfigServiceApplication.class, args);
    }

}
