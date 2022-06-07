package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;

@Service
public class DeleteServiceImpl implements DeleteService{

	@Autowired
	private ProductDao productDao;
	
	public int delete(Integer id) {
		return productDao.delete(id);
	}
}
