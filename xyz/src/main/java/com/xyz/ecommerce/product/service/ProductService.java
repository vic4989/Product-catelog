package com.xyz.ecommerce.product.service;

import java.util.List;

import com.xyz.ecommerce.product.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	
	public Product getProduct(Long id);

	public void addProduct(Product product);

	public void updateProduct(Product product, Long id);

	public void deleteProduct(Long id);

	public List<Product> getProductByBrand(String brand);
}
