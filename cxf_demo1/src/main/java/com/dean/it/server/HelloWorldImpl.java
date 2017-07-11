package com.dean.it.server;

public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {
		String msg = "Hello " + text + "!";
		return msg;
	}

}
