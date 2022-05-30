package com.example.demo.entity;

public class Product {
	private Integer productId;
	private String productName;
	private Integer price;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product() {
		
	}
	
	public Product(Integer productId, String productName, Integer price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
