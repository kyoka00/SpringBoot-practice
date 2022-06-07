package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;


public interface ProductService {
	
	public List<Product> findByName(String name);
	public List<Product> findByPrice(Integer price);
	public List<Product> findByNamePrice(String name, Integer price);
	public List<Product> findAll();
	public int insert(String name, Integer price);
}