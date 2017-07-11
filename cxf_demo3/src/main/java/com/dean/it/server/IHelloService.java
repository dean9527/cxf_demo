package com.dean.it.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.dean.it.model.Customer;

@WebService(name="IHelloService")
public interface IHelloService {
	@WebResult(name="customer")
	@WebMethod(operationName="selectMaxAgeStudent")
	Customer selectMaxAgeStudent(@WebParam(name="c1") Customer c1, @WebParam(name="c2") Customer c2);
	
	@WebResult(name="customer")
	@WebMethod(operationName="selectMaxLongNameStudent")
	Customer selectMaxLongNameStudent(@WebParam(name="c1") Customer c1, @WebParam(name="c2") Customer c2);
}
