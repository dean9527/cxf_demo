package com.dean.it.server;

import javax.xml.ws.Endpoint;

public class Server {
	public static void main(String[] args){
		Endpoint.publish("http://127.0.0.1:8080/helloService",
				new HelloServiceImpl());
	}
}
