package com.example.ayeeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AyeEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyeEurekaServerApplication.class, args);
    }

}
