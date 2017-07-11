package com.dean.it.rest.server;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
public class Server {
	public static void main(String[] args) {
		JAXRSServerFactoryBean restFactory = new JAXRSServerFactoryBean();
		restFactory.getInInterceptors().add(new LoggingInInterceptor());
		restFactory.getOutInterceptors().add(new LoggingOutInterceptor());
		restFactory.setResourceClasses(StudentServiceImpl.class);
		restFactory.setAddress("http://localhost:8888/");
		restFactory.create();
		System.out.println("server start on 8888 port...");
	}
}
