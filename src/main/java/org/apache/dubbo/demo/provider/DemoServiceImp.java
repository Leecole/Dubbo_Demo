package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService;

public class DemoServiceImp implements DemoService {        //在服务提供商中实现接口
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
