package com.talecel.lin.autoconfigure.configuration;

import com.talecel.lin.autoconfigure.bean.HelloProperty;
import com.talecel.lin.autoconfigure.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(HelloProperty.class)
public class CommonConfiguration {

    @Autowired
    private HelloProperty helloProperty;

    @Bean
    public HelloService helloService(){

        HelloService helloService = new HelloService();
        helloService.setHelloProperty(this.helloProperty);

        return helloService;
    }
}
