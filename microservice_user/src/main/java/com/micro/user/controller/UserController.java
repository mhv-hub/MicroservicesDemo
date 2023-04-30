package com.micro.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.micro.user.entity.Contact;
import com.micro.user.entity.User;
import com.micro.user.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
	
		User user = this.userServiceImpl.getUser(userId);
		List contacts = this.restTemplate.getForObject("http://contact-service/contact/"+userId, List.class);
		user.setContacts(contacts);
		
		return user;
	}
}
