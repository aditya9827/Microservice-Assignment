package com.nag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nag.entity.OrderEntity;
import com.nag.service.IOrderService;

@RestController
public class OrderController {
	
	private IOrderService orderService;
	
	@Autowired
	public OrderController(IOrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	@GetMapping(path = "/order-service/orders/1")
	public List<OrderEntity> getOrderList(){
		return orderService.getOrderDetails();
	}
	
	

}
