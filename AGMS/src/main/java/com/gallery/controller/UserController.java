package com.gallery.controller;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.User;
import com.gallery.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/login")
	public String validate(@RequestBody User user) throws ServletException
	{
		String jwtToken="";
		
		if(user.getUserName()==null && user.getPassword()==null)
		{
			throw new ServletException("Please fill in userName and password");
		}
		
		user = userservice.login(user.getUserName(), user.getPassword());
		
		if(user==null)
		{
			throw new ServletException("User details not found!");
		}
		return jwtToken;
	
	}
}
