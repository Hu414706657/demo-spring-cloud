package com.example.spring.cloud.consumer.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    private Logger logger = LoggerFactory.getLogger(ServiceController.class);

    @Value("${server.port}")
    private String port;

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String provider(@RequestParam(value = "message") String message) throws InterruptedException {
//        Thread.sleep(5000);
//        int a = 0/0;
        logger.info("message: "+message);
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
    }


    public String hiError(String message) {
        System.out.println("test");
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
