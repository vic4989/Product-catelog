package com.xyz.ecommerce.product.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xyz.ecommerce.product.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	public List<Product> findByBrand(String brand);

    public List<Product> findBySize(int size);

    public List<Product> findByPrice(Long price);
    
    public List<Product> findByColour(String brand);
}
