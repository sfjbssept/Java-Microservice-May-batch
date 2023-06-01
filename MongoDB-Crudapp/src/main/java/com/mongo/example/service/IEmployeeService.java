package com.mongo.example.service;

import org.springframework.http.ResponseEntity;

import com.mongo.example.entity.Employee;

public interface IEmployeeService {

	public Employee addEmployee(Employee employee);

	public ResponseEntity<?> getEmployee();

	public void deleteEmp(Employee employee);

}
