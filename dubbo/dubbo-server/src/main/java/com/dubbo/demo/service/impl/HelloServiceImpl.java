package com.dubbo.demo.service.impl;

import com.dubbo.demo.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "hello " + name;
	}

}
