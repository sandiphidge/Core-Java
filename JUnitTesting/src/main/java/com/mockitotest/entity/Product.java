package com.mockitotest.entity;

import com.mockitotest.interfaces.Service;

public class Product {
	Service service;
	public Product(Service service){
		this.service = service;
	}
 public int getTotalCost() {
	return  service.totalproduct() * service.productPrice();
 }
}
