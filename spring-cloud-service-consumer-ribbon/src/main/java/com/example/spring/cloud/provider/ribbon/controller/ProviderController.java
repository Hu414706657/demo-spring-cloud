package com.example.spring.cloud.provider.ribbon.controller;


import com.example.spring.cloud.provider.ribbon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private DemoService service;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String serviceController(@RequestParam(value = "message") String message) {
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
    }


    @RequestMapping(value = "/getHi", method = RequestMethod.GET)
    public String providerController(@RequestParam(value = "message") String message) {
        return service.demo(message);
    }


}
