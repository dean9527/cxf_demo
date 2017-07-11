package com.dean.it.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.dean.it.server.HelloWorld;

public class Client {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloWorld.class);
		factory.setAddress("http://localhost:9090/ws/HelloWorld");
		HelloWorld helloWorld = (HelloWorld)factory.create();
		System.out.println(helloWorld.sayHi("dean"));
		System.exit(0);
	}
}
