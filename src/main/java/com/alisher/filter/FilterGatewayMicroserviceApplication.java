package com.alisher.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FilterGatewayMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterGatewayMicroserviceApplication.class, args);
    }
}
