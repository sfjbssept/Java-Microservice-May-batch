package com.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Employee;
import com.ems.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService iEmployeeService;
	
	@PostMapping("/employee")
	Integer createEmployee(@RequestBody Employee employee) {
		Integer id = iEmployeeService.saveEmployee(employee);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/allemployees")
	public List<Employee> getAllEmployees() {
		return iEmployeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable Integer id) {
		Optional<Employee> employee = iEmployeeService.getEmployee(id);
		return employee;
	}

}
