package com.dean.it.rest.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path(value="/studentService")
@Produces("application/json")
//@Produces("application/xml")
public interface IStudentService {
	@GET
	@Path(value="/info/{id}")
	Student getStudent(@PathParam("id") long id, @QueryParam("name") String name);
	
	@GET
	@Path(value="/info2")
	Student getStudent(@QueryParam("name") String name);
}
