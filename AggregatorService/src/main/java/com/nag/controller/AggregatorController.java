package com.nag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nag.entity.Aggregator;
import com.nag.entity.Order;
import com.nag.entity.User;
import com.nag.feign.proxy.OrderServiceProxy;
import com.nag.feign.proxy.UserServiceProxy;

@RestController
public class AggregatorController {
	
	private OrderServiceProxy orderServiceProxy;
	private UserServiceProxy userServiceProxy;
	
	@Autowired
	public AggregatorController(OrderServiceProxy orderServiceProxy, UserServiceProxy userServiceProxy) {
		super();
		this.orderServiceProxy = orderServiceProxy;
		this.userServiceProxy = userServiceProxy;
	}
	
	@GetMapping(path = "/orderdetails/1")
	public ResponseEntity<Aggregator> getAggregateDetails(){
		
		List<Order> orderList = this.orderServiceProxy.getOrderList();
		User userById = this.userServiceProxy.getUserById(1L);
		
		return new ResponseEntity<Aggregator>(new Aggregator(userById, orderList), HttpStatus.FOUND);
	}
	
	

}
