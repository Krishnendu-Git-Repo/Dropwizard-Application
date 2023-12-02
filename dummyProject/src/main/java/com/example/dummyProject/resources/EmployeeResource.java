package com.example.dummyProject.resources;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class EmployeeResource {
	
	//@Path("/names")
	@GET
	public String getEmployee(){
		return "Hello";
	}

}
