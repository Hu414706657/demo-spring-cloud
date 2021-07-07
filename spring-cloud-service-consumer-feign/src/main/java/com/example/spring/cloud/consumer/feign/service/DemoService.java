package com.example.spring.cloud.consumer.feign.service;


import com.example.spring.cloud.consumer.feign.controller.fallback.ErrorBallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SPRING-CLOUD-SERVICE-PROVIDER",fallback = ErrorBallback.class)
public interface DemoService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);

}
