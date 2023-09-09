package com.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {
	
	@GetMapping("/test")
	public String getDetails() {
		
		return "program running successfully";
	}

}