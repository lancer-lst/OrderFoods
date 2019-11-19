package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootGateWay {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGateWay.class,args);
    }
}
