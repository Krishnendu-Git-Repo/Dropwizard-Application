package com.practice.userService.core;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "employees")
public class Employee {
	
	@Id
	private Integer employee_id;
	private String employee_name;
	private BigInteger salary;
	private Integer department_id;
	private Integer manager_id;
	
	public Employee() {
		super();
	}

	public Employee(Integer employee_id, String employee_name, BigInteger salary, Integer department_id,
			Integer manager_id) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.salary = salary;
		this.department_id = department_id;
		this.manager_id = manager_id;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public BigInteger getSalary() {
		return salary;
	}

	public void setSalary(BigInteger salary) {
		this.salary = salary;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public Integer getManager_id() {
		return manager_id;
	}

	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", salary=" + salary
				+ ", department_id=" + department_id + ", manager_id=" + manager_id + "]";
	}
	
	
	
	

}
