package com.jiangxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaClient2Application.class, args);
    }

}
