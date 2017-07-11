package com.dean.it.rest.client;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Client {
	public static void main(String[] args) throws IOException, IOException {
		//HttpGet get = new HttpGet("http://localhost:8888/studentService/info/2?name=Wang");
		HttpGet get = new HttpGet("http://localhost:8888/studentService/info2?name=aBao");
		HttpClient httpClient = new DefaultHttpClient();
		HttpResponse response = httpClient.execute(get);
		InputStream ins = response.getEntity().getContent();
		byte[] b = new byte[1024];
		StringBuilder sb = new StringBuilder();
		while(ins.read(b) != -1){
			sb.append(new String(b, "UTF-8").trim());
		}
		System.out.println(sb.toString());
	}
}
