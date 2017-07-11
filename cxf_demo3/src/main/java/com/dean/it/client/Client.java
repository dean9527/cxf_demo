package com.dean.it.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;



public class Client {
	public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://127.0.0.1:8080/helloService");
		factory.setServiceClass(IHelloService.class);
		Object obj = factory.create();
		IHelloService helloService = (IHelloService)obj;
		
		Customer c1 = new Customer();
		c1.setId(1L);
		c1.setName("A");
		GregorianCalendar gregorianCalendar1 =new GregorianCalendar(); 
		gregorianCalendar1.setTime(new SimpleDateFormat("yyyy-MM-dd")
				.parse("1989-01-28"));
		XMLGregorianCalendar xmlDatetime1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar1);
	    c1.setBirthdary(xmlDatetime1);
	    
	    Customer c2 = new Customer();
	    c2.setId(2L);
	    c2.setName("B");
	    GregorianCalendar gregorianCalendar2 =new GregorianCalendar(); 
		gregorianCalendar2.setTime(new SimpleDateFormat("yyyy-MM-dd")
				.parse("1990-01-28"));
		XMLGregorianCalendar xmlDatetime2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar2);
	    c2.setBirthdary(xmlDatetime2);
	    
	    Customer oldCustomer = helloService.selectMaxAgeStudent(c1, c2);
	    System.out.print("The old age student is " + oldCustomer.getName() + " and his birthday is " + oldCustomer.getBirthdary().toString());
	}
}
