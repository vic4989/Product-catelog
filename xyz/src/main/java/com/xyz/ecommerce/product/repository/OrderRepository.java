package com.xyz.ecommerce.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.ecommerce.product.model.Product;

public interface OrderRepository extends CrudRepository<Product, Long> {

}
