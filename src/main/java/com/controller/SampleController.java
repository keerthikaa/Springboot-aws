package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping(value="/")
	public String hello() {
		return "Welcome to Spring Boot by Keerthiii";
	}
	
	

}
