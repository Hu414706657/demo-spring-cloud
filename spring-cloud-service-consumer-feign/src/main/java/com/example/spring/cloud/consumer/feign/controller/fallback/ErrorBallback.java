package com.example.spring.cloud.consumer.feign.controller.fallback;

import com.example.spring.cloud.consumer.feign.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author: 胡文良
 * @ClassName ErrorBallback.java
 * @description:
 * @create: 2021-07-07 11:59
 **/
@Component
public class ErrorBallback implements DemoService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
