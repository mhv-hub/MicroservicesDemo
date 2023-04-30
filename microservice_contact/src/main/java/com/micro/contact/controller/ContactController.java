package com.micro.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.contact.entity.Contact;
import com.micro.contact.service.ContactServiceImpl;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	@GetMapping("/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId){
		
		return this.contactServiceImpl.getContactOfUser(userId);
	}

}
