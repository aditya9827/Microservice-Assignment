package com.nag.feign.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.nag.entity.Order;

@FeignClient(name = "order-service", url = "${ORDER_SERVICE_URI:http://localhost}:8081")
public interface OrderServiceProxy {
	
	@GetMapping(path = "/order-service/orders/1")
	public List<Order> getOrderList();
}
