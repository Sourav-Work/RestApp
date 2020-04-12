package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${app.id}")
	String instance;

	@GetMapping("/")
	public String getInstanceName() {
		return "Welcome, I am " + instance;
	}

}
