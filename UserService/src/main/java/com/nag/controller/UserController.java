package com.nag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nag.entity.UserEntity;
import com.nag.service.IUserService;

@RestController
@RequestMapping(path = "/user-service")
public class UserController {
	
	private IUserService userService;
	
	@Autowired
	public UserController(IUserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping(path = "/user/{id}")
	public UserEntity getUserById(@PathVariable Long id){
		return userService.getUserById(id);
	}
	
	@PostMapping(path = "/addUser")
	public UserEntity saveUser(@RequestBody UserEntity user) {
		return this.userService.addUserDetails(user);
	}
	
	

}
