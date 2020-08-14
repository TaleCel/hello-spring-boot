package top.izoom.lin.autoconfigure.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.izoom.lin.autoconfigure.bean.HelloProperty;
import top.izoom.lin.autoconfigure.service.HelloService;

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
