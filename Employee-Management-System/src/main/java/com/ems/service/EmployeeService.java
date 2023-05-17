package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ems.entity.Employee;
import com.ems.repo.DaoRepo;

public class EmployeeService implements IEmployeeService {
	
	@Autowired
	DaoRepo daoRepo;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee saveEmployee = daoRepo.save(employee);
		return saveEmployee.getId();
	}
	


}
