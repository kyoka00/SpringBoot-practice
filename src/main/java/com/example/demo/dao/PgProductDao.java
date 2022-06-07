package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class PgProductDao implements ProductDao{
	
	private static final String SELECT_BY_NAME = "SELECT * FROM products WHERE product_name = :name";
	private static final String SELECT_BY_PRICE = "SELECT * FROM products WHERE price = :price";
	private static final String SELECT_BY_NAMEPRICE = "SELECT * FROM products WHERE product_name = :name AND price= :price";
	private static final String SELECT_ALL = "SELECT * FROM products";
	private static final String INSERT ="INSERT INTO products (product_name, price) VALUES (:name, :price)";
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	public List<Product> findByName(String name) {
		String sql = SELECT_BY_NAME;
		
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("name", name);
		
		List<Product> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));
		
		return resultList.isEmpty() ? null :resultList;
	}
	
	public List<Product> findByPrice(Integer price) {
		String sql = SELECT_BY_PRICE;
		
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("price", price);
		
		List<Product> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));
		
		return resultList.isEmpty() ? null :resultList;
	}
	
	public List<Product> findByNamePrice(String name, Integer price) {
		String sql = SELECT_BY_NAMEPRICE;
		
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("name", name);
		param.addValue("price", price);
		
		List<Product> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));
		
		return resultList.isEmpty() ? null :resultList;
	}
	
	public List<Product> findAll() {
		String sql = SELECT_ALL;
		
		List<Product> resultList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Product>(Product.class));
		
		return resultList.isEmpty() ? null :resultList;
	}
	
	public int insert(String name, Integer price) {
String sql = INSERT;
		
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("name", name);
		param.addValue("price", price);
		
		return jdbcTemplate.update(sql, param);
	}
}

