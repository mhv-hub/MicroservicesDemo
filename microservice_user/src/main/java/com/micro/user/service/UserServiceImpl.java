package com.micro.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(
			new User(130L, "Mahavir Ojha", "9934127414"),
			new User(136L, "Abhishek Nayak", "7209539994"),
			new User(137L, "Shashank Kumar", "1234567890")
	);	
	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

	
}
