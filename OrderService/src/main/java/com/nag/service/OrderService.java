package com.nag.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nag.entity.OrderEntity;

@Service
public class OrderService implements IOrderService {

	@Override
	public List<OrderEntity> getOrderDetails() {

		return orderList();
	}

	private List<OrderEntity> orderList() {
		List<OrderEntity> orderList = new ArrayList<>();
		orderList.add(new OrderEntity(1L, 250D, "14-Apr-2020"));
		orderList.add(new OrderEntity(2L, 250D, "15-Apr-2020"));
		return orderList;
	}

}
