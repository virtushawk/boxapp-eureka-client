package com.virtushawk.boxappeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BoxappEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoxappEurekaClientApplication.class, args);
    }

}
