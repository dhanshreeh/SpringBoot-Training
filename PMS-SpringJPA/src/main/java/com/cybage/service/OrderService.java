package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Order;
import com.cybage.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	public Order addOrder(Order order) {
	return orderRepository.save(order);
}

	public List<Order> fetchOrders() {
		return orderRepository.findAll();
	}

}
