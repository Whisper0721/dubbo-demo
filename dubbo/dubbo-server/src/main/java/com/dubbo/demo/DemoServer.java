package com.dubbo.demo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoServer {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath*:dubbo-*.xml");
		System.out.println(context.getDisplayName()+":here");
		context.start();
		System.out.println("服务已经启动...");
		System.in.read();
	}
}
