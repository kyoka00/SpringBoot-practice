package com.example.demo.controller;

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
    	Product p = productService.findById(form.getId());
    	if(p== null) {
    		model.addAttribute("msg","対象のデータはありません");
    		return "index";
    	}else {
    		model.addAttribute("product",p);
    		model.addAttribute("msg","データを取得しました");
    		return "result";
    		
    	}
    	
    }
}
