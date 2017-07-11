package com.dean.it.server;

import com.dean.it.model.Customer;

public class HelloServiceImpl implements IHelloService {

	public Customer selectMaxAgeStudent(Customer c1, Customer c2) {
		if(c1.getBirthdary().getTime() > c2.getBirthdary().getTime()){
			return c1;
		}else{
			return c2;
		}
	}

	public Customer selectMaxLongNameStudent(Customer c1, Customer c2) {
		if(c1.getName().length() > c2.getName().length()){
			return c1;
		}else{
			return c2;
		}
	}

}
