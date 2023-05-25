package com.micro.apigway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		
		return "User service is down at the moment !";
	}
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		
		return "Contact service is down at the moment !";
	}
}
