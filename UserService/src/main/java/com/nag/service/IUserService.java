package com.nag.service;

import org.springframework.stereotype.Service;

import com.nag.entity.UserEntity;


public interface IUserService {
	
	public UserEntity getUserById(Long userId);
	
	public UserEntity addUserDetails(UserEntity user);

}
