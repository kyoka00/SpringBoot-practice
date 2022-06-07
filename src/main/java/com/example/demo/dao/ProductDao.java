package com.example.demo.dao;
import com.example.demo.entity.Product;

public interface ProductDao {

		public int delete(Integer id);
		public int update(Product p);
		public Product select (Integer id);
		
	}

