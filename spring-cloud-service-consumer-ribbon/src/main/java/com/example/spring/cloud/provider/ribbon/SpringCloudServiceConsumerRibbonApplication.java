package com.example.spring.cloud.provider.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudServiceConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceConsumerRibbonApplication.class, args);
    }

}
