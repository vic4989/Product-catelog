package com.xyz.ecommerce.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.ecommerce.product.model.Order;
import com.xyz.ecommerce.product.repository.OrderRepository;
import com.xyz.ecommerce.product.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrder(Order order, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
