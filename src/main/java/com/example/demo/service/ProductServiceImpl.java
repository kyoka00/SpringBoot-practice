package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	public List<Product> findByName(String name){
		List<Product> p = productDao.findByName(name);
		return p;
	}
	public List<Product> findByPrice(Integer price){
		List<Product> p = productDao.findByPrice(price);
		return p;
	}
	public List<Product> findByNamePrice(String name, Integer price){
		List<Product> p = productDao.findByNamePrice(name, price);
		return p;
	}
	public List<Product> findAll(){
		List<Product> p = productDao.findAll();
		return p;
	}
	public int insert (String name, Integer price) {
		return productDao.insert(name, price);
	}
}
