package com.record;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RecordServiceMs2Application {

	public static void main(String[] args) {
		SpringApplication.run(RecordServiceMs2Application.class, args);
	}

}
