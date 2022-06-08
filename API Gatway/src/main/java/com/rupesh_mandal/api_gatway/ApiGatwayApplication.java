package com.rupesh_mandal.api_gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatwayApplication.class, args);
    }

}
