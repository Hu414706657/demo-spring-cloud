package com.example.spring.cloud.provider.ribbon.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    @Autowired
    public RestTemplate template;

    public String demo(String message) {
        return template.getForObject("http://SPRING-CLOUD-SERVICE-PROVIDER/hi?message=" + message, String.class);
    }

//    @RequestMapping("/consumer/dept/list")
//    public List<Dept> list(){
//        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
//    }
}
