package com.xyz.ecommerce.product.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long orderId;
	@ManyToOne
	private Product product;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date orderDate;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public Order() {
		super();
	}
	
	public Order(Long orderId, Product product, Date orderDate) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.orderDate = orderDate;
	}
	
	
	
		
}
