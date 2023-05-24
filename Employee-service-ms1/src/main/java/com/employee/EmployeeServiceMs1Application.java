package com.employee;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeServiceMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceMs1Application.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	
	// task 
	// intregrate this emplopyee service with mysql db 
	// add dependencies such as jdbc, mysql, jpa
	// add repo
	// create schema in mysql db
	// add @entity in entity file 
	// add the findbyid service and then comment out the fake list and add the data directly to db 
}
