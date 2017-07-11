package com.dean.it.rest.server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
public class Server {
	public static void main(String[] args) {
		JAXRSServerFactoryBean restFactory = new JAXRSServerFactoryBean();
		restFactory.setResourceClasses(StudentServiceImpl.class);
		restFactory.setAddress("http://localhost:8888/");
		restFactory.create();
	}
}
