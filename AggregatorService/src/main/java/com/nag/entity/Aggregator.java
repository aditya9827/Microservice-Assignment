package com.nag.entity;

import java.util.List;

public class Aggregator {
	
	private User userDetails;
	
	private List<Order> orders;

	public Aggregator() {
		super();
	}

	public Aggregator(User user, List<Order> orders) {
		super();
		this.userDetails = user;
		this.orders = orders;
	}

	public User getUser() {
		return userDetails;
	}

	public void setUser(User user) {
		this.userDetails = user;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	

}
