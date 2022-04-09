package com.alzohar.products.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	
	private int id;
	private String name;
	private String desc;
	private boolean enabled;
	private double price;
	private Date createdAt;
}
