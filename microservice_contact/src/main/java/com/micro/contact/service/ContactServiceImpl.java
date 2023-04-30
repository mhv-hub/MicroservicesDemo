package com.micro.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.micro.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list = List.of(
			new Contact(1L, "mahavir.ojha@gmail.com", "Mahavir", 136L),
			new Contact(2L, "shashank.kumar@gmail.com", "Shashank", 136L),
			new Contact(3L, "mahavir.ojha@gmail.com", "Mahavir", 137L),
			new Contact(4L, "abhishek.nayak@gmail.com", "Abhishek", 137L),
			new Contact(5L, "shashank.kumar@gmail.com", "Shashank", 130L),
			new Contact(6L, "abhishek.nayak@gmail.com", "Abhishek", 130L)
	);
	
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
