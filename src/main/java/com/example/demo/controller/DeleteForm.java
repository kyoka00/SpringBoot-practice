package com.example.demo.controller;

import javax.validation.constraints.NotNull;

public class DeleteForm {
	@NotNull
	private Integer id;

	
	private String name;

	
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
	public DeleteForm() {
		
	}
	public DeleteForm(Integer product_id, String name, Integer price) {
		this.id=product_id;
		this.name =name;
		this.price = price;
	}
    
}


