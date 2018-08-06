package com.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.demo.service.HelloService;


public class DemoClient {
	public static void main(String[] args) {
		String configLocation="classpath*:/dubbo-client.xml";  
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(configLocation);  
        HelloService us=(HelloService) context.getBean("helloService");  
        String[] names=context.getBeanDefinitionNames();  
        System.out.println(us.hello(" world"));
	}

}
