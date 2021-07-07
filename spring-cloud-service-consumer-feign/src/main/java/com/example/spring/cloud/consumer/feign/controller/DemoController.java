package com.example.spring.cloud.consumer.feign.controller;

import com.example.spring.cloud.consumer.feign.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 胡文良
 * @ClassName DemoController.java
 * @description:
 * @create: 2021-05-27 22:27
 **/
@RestController
public class DemoController {

    @Autowired
    private DemoService service;

//    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message) {
        return service.sayHi(message);
    }

    public String hiError(String message){
        return "faile";
    }

}
