package com.mongo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.example.entity.Employee;
import com.mongo.example.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired IEmployeeService iEmployeeService;
	
	
	@PostMapping("/emp")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
		ResponseEntity<?> emp = iEmployeeService.addEmployee(employee);
		return ResponseEntity.ok(emp);
	}
	
	@GetMapping("/getemp")
	public ResponseEntity<?> getEmployee() {
		return iEmployeeService.getEmployee();
	}
	

}
