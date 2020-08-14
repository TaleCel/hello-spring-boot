package top.izoom.lin.autoconfigure.service;

import top.izoom.lin.autoconfigure.bean.HelloProperty;

public class HelloService {
    private HelloProperty helloProperty;

    public String sayHello(){
        return this.helloProperty.getName()+"你好啊";
    }

    public HelloProperty getHelloProperty() {
        return helloProperty;
    }

    public void setHelloProperty(HelloProperty helloProperty) {
        this.helloProperty = helloProperty;
    }
}
