package com.example.demo.dao;
import java.util.List;

import com.example.demo.entity.Product;

public interface ProductDao {

		public List<Product> findByName(String name);
		public List<Product> findByPrice(Integer price);
		public List<Product> findByNamePrice(String name, Integer price);
		public List<Product> findAll();
		public int insert(String name, Integer Price);
	}

