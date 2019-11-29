package com.xyz.ecommerce.product.service;

import java.util.List;

import com.xyz.ecommerce.product.model.Order;

public interface OrderService {
	public List<Order> getAllOrders();
	
	public Order getOrder(Long id);

	public void addOrder(Order order);

	public void updateOrder(Order product, Long id);

	public void deleteOrder(Long id);

}
