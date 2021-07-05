package com.example.spring.cloud.consumer.controller;


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

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String provider(@RequestParam(value = "message") String message) {
        logger.info("message: "+message);
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
    }
}
