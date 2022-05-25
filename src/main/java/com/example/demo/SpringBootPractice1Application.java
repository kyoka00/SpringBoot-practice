package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@SpringBootApplication
public class SpringBootPractice1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringBootPractice1Application.class, args);
		
		ProductService productService = context.getBean(ProductService.class);
		List<Product> list = productService.findAll();
		for (Product p: list) {
			System.out.println(p.getProductInfo());
		}
	}

}
