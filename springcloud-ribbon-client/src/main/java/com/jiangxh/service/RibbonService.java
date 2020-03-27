package com.jiangxh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String getHello(String name){
        return restTemplate.getForObject("http://springcloud-eureka-client/hello?name="+name,String.class);
    }

}
