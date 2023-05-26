package com.mongo.example.service;

import org.springframework.http.ResponseEntity;

import com.mongo.example.entity.Employee;

public interface IEmployeeService {
	
	public ResponseEntity<?> addEmployee(Employee employee);
	
	public ResponseEntity<?> getEmployee();

}
