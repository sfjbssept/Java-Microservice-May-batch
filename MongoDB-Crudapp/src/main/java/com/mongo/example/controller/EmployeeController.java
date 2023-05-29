package com.mongo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.example.entity.Employee;
import com.mongo.example.repo.IEmployeeRepo;
import com.mongo.example.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired IEmployeeService iEmployeeService;
	
	@Autowired IEmployeeRepo iEmployeeRepo;
	
	@PostMapping("/emp")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
		ResponseEntity<?> emp = iEmployeeService.addEmployee(employee);
		return ResponseEntity.ok(emp);
	}
	
	@GetMapping("/getemp")
	public ResponseEntity<?> getEmployee() {
		return iEmployeeService.getEmployee();
	}
//	
//	@PutMapping("/tutorials/{id}")
//	public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") String id, @RequestBody Tutorial tutorial) {
//	  Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
//
//	  if (tutorialData.isPresent()) {
//	    Tutorial _tutorial = tutorialData.get();
//	    _tutorial.setTitle(tutorial.getTitle());
//	    _tutorial.setDescription(tutorial.getDescription());
//	    _tutorial.setPublished(tutorial.isPublished());
//	    return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
//	  } else {
//	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	  }
//	}
	

}
