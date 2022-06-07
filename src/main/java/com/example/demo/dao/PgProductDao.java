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
	
	private static final String DELETE = "DELETE FROM products WHERE product_id = :id";
	private static final String UPDATE = "UPDATE products SET product_name =:name, price = :price where product_id = :id";
	private static final String SELECT = "SELECT *  FROM products WHERE product_id = :id";
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	public int delete(Integer id) {
		String sql = DELETE;
		
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", id);

		return jdbcTemplate.update(sql, param);
	}
	public int update(Product p) {
		String sql = UPDATE;
		
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", p.getProductId());
		param.addValue("name", p.getProductName());
		param.addValue("price", p.getPrice());

		return jdbcTemplate.update(sql, param);
	}

	public Product select(Integer id) {
		String sql = SELECT;

		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", id);

		List<Product> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));

		return resultList.isEmpty() ? null : resultList.get(0);
	}
}

