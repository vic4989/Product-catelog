package com.xyz.ecommerce.product.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.ecommerce.product.model.Product;
import com.xyz.ecommerce.product.repository.ProductRepository;
import com.xyz.ecommerce.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	@Override
	public Product getProduct(Long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product, Long id) {
		productRepository.save(product);
	}
	
	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> getProductByBrand(String brand) {
		return productRepository.findByBrand(brand);
	}

}
