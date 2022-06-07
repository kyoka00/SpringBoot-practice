package com.example.demo.controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductForm {
	@NotNull
	private Integer id;

	@NotBlank
	private String name;

	@NotNull
	private Integer price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
		}
	public ProductForm() {
		
	}
	public ProductForm(Integer product_id, String name, Integer price) {
		this.id=product_id;
		this.name =name;
		this.price = price;
	}
    
}


