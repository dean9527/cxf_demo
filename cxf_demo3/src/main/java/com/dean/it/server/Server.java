package com.dean.it.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
	public static void main(String[] args) {
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		//注意服务器端setServiceClass这里是实现类不是接口
		factory.setServiceClass(HelloServiceImpl.class);
		factory.setAddress("http://127.0.0.1:8080/helloService");
		factory.create();
		System.out.println("server is start...");
	}
}
