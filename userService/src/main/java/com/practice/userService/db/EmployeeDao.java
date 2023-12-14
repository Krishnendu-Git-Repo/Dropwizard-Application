package com.practice.userService.db;

import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;

import com.mysql.cj.Query;
import com.practice.userService.core.Employee;

import io.dropwizard.hibernate.AbstractDAO;

public class EmployeeDao extends AbstractDAO<Employee> {

	public EmployeeDao(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public Optional<Employee> findById(Integer employee_id) {
		return Optional.ofNullable(get(employee_id));

	}
	
	public List<Employee> findAll(){
		return null;
	}
}
