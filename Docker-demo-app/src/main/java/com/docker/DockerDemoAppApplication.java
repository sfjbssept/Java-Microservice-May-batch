package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoAppApplication.class, args);
	}

	@GetMapping("/")
	public String Hello() {
		return "Hello this is a Spring application deployed on docker";
	}
}
