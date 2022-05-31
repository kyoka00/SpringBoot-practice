package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;


@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
    @RequestMapping("/res")
    public String index(@ModelAttribute("res") ProductForm form,Model model) {
    	
        return "index";
    }
    
    @RequestMapping(value="/productResult", method=RequestMethod.POST)
    public String post(@ModelAttribute("res")ProductForm form, Model model) {
    	List<Product> p = productService.findAll();
        model.addAttribute("productList",p);
        return "result";
    }
}
