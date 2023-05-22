package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired 
	IEmployeeService iEmployeeService;
	
	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable("eId") Long eId) {
		Employee employee = iEmployeeService.getEmployee(eId);
		return employee;		
	}
	
//	localhost:8080/emp/1201
	
	
}
