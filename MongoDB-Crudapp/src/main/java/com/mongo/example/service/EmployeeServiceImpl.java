package com.mongo.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mongo.example.entity.Employee;
import com.mongo.example.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo iEmployeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		//Employee save = this.iEmployeeRepo.save(employee);
		return this.iEmployeeRepo.save(employee);
	}

	@Override
	public ResponseEntity<?> getEmployee() {
		return ResponseEntity.ok(this.iEmployeeRepo.findAll());
	}
	

	@Override
	public void deleteEmp(Employee employee) {
	 iEmployeeRepo.delete(employee);	
	}
	

}
