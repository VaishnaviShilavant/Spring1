package com.gallery.service;

import org.springframework.stereotype.Service;

import com.ems.entity.User;

@Service
public interface UserService {
	//method to login into the system using userName and password
		User login(String userName, String password);

}
