package com.example.demo.entity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Product;


@Controller
public class ProductController {
	
    @RequestMapping("/res")
    public String index(@ModelAttribute("res") ProductForm form,Model model) {
    	List<Product> p = new ArrayList<Product>();
		p.add(new Product(101,"鉛筆", 50));
		p.add(new Product(102,"消しゴム", 100));
		model.addAttribute("productList",p);
        return "index";
    }
    
    @RequestMapping(value="/productResult", method=RequestMethod.POST)
    public String post(@ModelAttribute("res")ProductForm form, Model model) {
        int id = form.getId();
        String name = form.getUserName();
        Product p = null;
        switch(id) {
        case 101:
        	p = new Product (101,"鉛筆", 50);
        	break;
        case 102:
        	p = new Product(102,"消しゴム", 100);
        	break;
        }
        model.addAttribute("product",p);
        model.addAttribute("userName", name);
        
        
        return "result";
    }
}
