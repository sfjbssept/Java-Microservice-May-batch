package com.ems.service;


import java.util.List;

import com.ems.entity.Employee;


public interface IEmployeeService {
	
	Integer saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();

}
