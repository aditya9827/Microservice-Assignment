package com.nag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nag.entity.UserEntity;
import com.nag.entity.repo.UserRepo;

@Service
public class UserService implements IUserService {

	private UserRepo userRepo;

	@Autowired
	public UserService(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public UserEntity getUserById(Long userId) {
		return this.userRepo.findById(userId).get();
	}

	@Override
	public UserEntity addUserDetails(UserEntity user) {
		return this.userRepo.save(user);
	}

}
