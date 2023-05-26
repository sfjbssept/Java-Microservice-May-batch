package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.entity.Employee;
import com.employee.repo.IEmployeeRepository;
 

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	IEmployeeRepository iEmployeeRepository;

	
//	List<Employee> list = List.of(
//			new Employee(1200L,"Ken Miles","7878787878","ken@gmail.com"),
//			new Employee(1201L,"Tom Shelby","7878787874","tom@gmail.com"),
//			new Employee(1202L,"Kevin Peterson","8858787878","kevin@gmail.com"),
//			new Employee(1203L,"Rohit sharma","5444874548","rohit@gmail.com"),
//			new Employee(1204L,"Ricky","544487878","ricky@gmail.com"),
//			new Employee(1205L,"David miller","4575487548","david@gmail.com"),
//			new Employee(1206L,"Virat Kohli","77877711518","VK@gmail.com"),
//			new Employee(1207L,"Hardik","74444447474","hardik@gmail.com"),
//			new Employee(1208L,"Gautam Ghambir","74578454158","gautam@gmail.com"),
//			new Employee(1209L,"MS Dhoni","215484518555","ms@gmail.com"),
//			new Employee(1210L,"Suresh Raina","7878787888","suresh@gmail.com")
//			);
	
	@Override
	public Optional<Employee> getEmployee(Long id) {
//		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
		return iEmployeeRepository.findById(id);
	}

}
