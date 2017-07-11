package com.dean.it.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
	public static void main(String[] args) throws InterruptedException {
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(HelloWorldImpl.class);
		factory.setAddress("http://localhost:9090/ws/HelloWorld");
		factory.create();
		
		System.out.println("Server start...");
		Thread.sleep(60 * 1000);
		System.out.println("Server exit...");
		System.exit(0);
	}
}
