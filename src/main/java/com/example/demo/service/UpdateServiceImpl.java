package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;

@Service
public class UpdateService{

	@Autowired
	private ProductDao productDao;
	
	@Transactional
	public List<Product> update(Product p){
		
		Product before = productDao.select(p.getProductId());
		int count = productDao.update(p);
		Product after = productDao.select(p.getProductId());
		
		List<Product> list = new ArrayList<>();
		
		if(count != 0) {
			list.add(before);
			list.add(after);
		}
		
		return list;
	}
}
