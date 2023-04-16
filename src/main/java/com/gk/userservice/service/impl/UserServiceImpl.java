package com.gk.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.userservice.model.User;
import com.gk.userservice.repository.UserRepository;
import com.gk.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User findByUserId(long userId) {
		
		return userRepository.findById(userId).get();
	}

}
