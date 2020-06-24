package com.nag.entity.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nag.entity.UserEntity;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long>{

}
