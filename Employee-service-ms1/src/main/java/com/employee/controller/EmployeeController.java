package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.entity.Employee;
import com.employee.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired 
	IEmployeeService iEmployeeService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{eId}")
	public Optional<Employee> getEmployee(@PathVariable("eId") Long eId) {
		Optional<Employee> employee = iEmployeeService.getEmployee(eId);
		
		//List records = restTemplate.getForObject("http://localhost:8081/record/" + eId, List.class);
         //  employee.setRecords(records);
		return employee;		
	}
	
//	localhost:8080/emp/1201
	
	
}
