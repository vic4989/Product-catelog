package com.xyz.ecommerce.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.ecommerce.product.model.Order;
import com.xyz.ecommerce.product.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value = "/orders")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@RequestMapping(value = "/orders/{id}")
	public Order getOrder(@PathVariable Long id){
		return orderService.getOrder(id);
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.POST )
	public void addOrder(@RequestBody Order order){
		orderService.addOrder(order);
	}
	
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.PUT )
	public void updateOrder(@RequestBody Order order,@PathVariable Long id){
		orderService.updateOrder(order, id);
	}
	
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.DELETE )
	public void deleteOrder(@PathVariable Long id){
		orderService.deleteOrder(id);
	}
	
	
}
