package com.practice.userService.resources;

import java.util.List;
import java.util.Optional;

import com.practice.userService.core.Employee;
import com.practice.userService.db.EmployeeDao;

import io.dropwizard.hibernate.UnitOfWork;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	private final EmployeeDao employeeDAO;

	public UserResource(EmployeeDao employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Path("/name")
	@GET
	public String name() {
		return " << JAVA >> ";
	}

	@GET
	@Path("/{id}")
	@UnitOfWork
	public Optional<Employee> findById(@PathParam("id") Integer employee_id) throws Exception {
		Optional<Employee> findById = employeeDAO.findById(employee_id);
		if (findById.isPresent()) {
			return findById;
		} else {
			System.out.println("not found");
			return Optional.empty();
		}
	}
	
	@GET
	@Path("/all")
	@UnitOfWork
	public List<Employee> findAll(){
		return employeeDAO.findAll();
		}

}
