package com.micro.contact.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.contact.entity.Contact;

@Service
public interface ContactService {

	public List<Contact> getContactOfUser(Long userId);
}
