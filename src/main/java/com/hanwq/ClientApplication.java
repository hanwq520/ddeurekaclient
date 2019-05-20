package com.hanwq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: ddeurekaclient
 * Created by hanwq on 2019/5/16 16:14
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(ClientApplication.class).web(true).run(args);
    }
}
