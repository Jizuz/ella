package com.jizuz.ellaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EllaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EllaClientApplication.class, args);
    }

}
