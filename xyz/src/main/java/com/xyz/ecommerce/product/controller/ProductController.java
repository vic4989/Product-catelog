package com.xyz.ecommerce.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.ecommerce.product.model.Product;
import com.xyz.ecommerce.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@RequestMapping(value = "/products/{id}")
	public Product getProduct(@PathVariable Long id){
		return productService.getProduct(id);
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST )
	public void addProduct(@RequestBody Product product){
		productService.addProduct(product);
	}
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT )
	public void updateProduct(@RequestBody Product product,@PathVariable Long id){
		productService.updateProduct(product, id);
	}
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE )
	public void updateProduct(@PathVariable Long id){
		productService.deleteProduct(id);
	}
	
	@RequestMapping(value = "/products/brand/{brand}")
	public List<Product> getProductByBrand(@PathVariable String brand){
		return productService.getProductByBrand(brand);
	}
}
