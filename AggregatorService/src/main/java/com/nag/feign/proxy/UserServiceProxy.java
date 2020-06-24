package com.nag.feign.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nag.entity.User;

@FeignClient(name = "user-service", url = "${USER_SERVICE_URI://localhost}:8082")
public interface UserServiceProxy {
	
	@GetMapping(path = "/user-service/user/{id}")
	public User getUserById(@PathVariable Long id);

}
