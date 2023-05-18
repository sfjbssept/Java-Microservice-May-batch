package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.repo.DaoRepo;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	DaoRepo daoRepo;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee saveEmployee = daoRepo.save(employee);
		return saveEmployee.getId();
	}
	


}
