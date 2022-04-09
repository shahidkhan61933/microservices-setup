package com.alzohar.products.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alzohar.products.entity.Product;

@RestController
public class ProductController {
	
	List<Product> products = new ArrayList<Product>();
	
	@GetMapping("/products")
	public List<Product> getAll() {
		if(products.isEmpty()) {
			addDefaults();
		}
		return products;
	}
	
	@GetMapping("/products/{id}")
	public Product getOne(@PathVariable("id") int id) {
		for(Product acc: products) {
			if(acc.getId()==id) {
				return acc;
			}
		}
		return null;
	}

	private void addDefaults() {
		products.add(new Product(1001, "Apple mac book xyz model", "Laptop", true, 5335.55, new Date()));
		products.add(new Product(1002, "HP book xyz model", "Laptop", true, 1335.55, new Date()));
		products.add(new Product(1003, "Acer book xyz model", "Laptop", true, 34335.55, new Date()));
		products.add(new Product(1004, "Asus book xyz model", "Laptop", true, 335.55, new Date()));
		products.add(new Product(1005, "Dell book xyz model", "Laptop", true,4435.55, new Date()));
	}
}
