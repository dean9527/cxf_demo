package com.dean.it.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
	public static void main(String[] args) {
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(HelloServiceImpl.class);
		factory.setAddress("http://127.0.0.1:8080/helloService");
		factory.create();
		System.out.println("server is start...");
	}
}
