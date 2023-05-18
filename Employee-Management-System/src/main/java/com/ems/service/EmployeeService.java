package com.ems.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Employee> getAllEmployees() {

		return daoRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Integer id) {
		return daoRepo.findById(id);
	}

}
