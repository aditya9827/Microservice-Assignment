package com.nag.service;

import java.util.List;

import com.nag.entity.OrderEntity;

public interface IOrderService {
	public List<OrderEntity> getOrderDetails();
}
