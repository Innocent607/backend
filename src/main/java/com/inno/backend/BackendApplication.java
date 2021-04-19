package com.inno.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
@SpringBootApplication annotation includes,
	1. Auto Configuration - auto-configures an in-memory database.
	2. Component Scan - scans all the components included in the project
	3. Spring Boot Configuration
 */
@SpringBootApplication
@RestController
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	/*
	the Request URI method to return "Hello Booster"
	 */
	@RequestMapping(value="/")
	public String hello() {
		return "Hello Booster";
	}
}
