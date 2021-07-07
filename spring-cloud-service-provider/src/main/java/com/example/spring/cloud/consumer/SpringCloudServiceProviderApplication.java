package com.example.spring.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
//@EnableHystrixDashboard
public class SpringCloudServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceProviderApplication.class, args);
    }

}
