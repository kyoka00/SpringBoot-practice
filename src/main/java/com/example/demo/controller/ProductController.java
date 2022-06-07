package com.example.demo.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;


@Controller
public class ProductController {
	@Autowired
	MessageSource message;
	@Autowired
	ProductService productService;
	
    @RequestMapping("/res")
    public String index(@ModelAttribute("res") ProductForm form, Model model) {
    	
        return "index";
    }
    
    @RequestMapping(value="/productResult", method=RequestMethod.POST ,params="search")
    public String post(@ModelAttribute("res")ProductForm form, BindingResult bindingResult, Model model) {
    	String name = form.getName();
		Integer price = form.getPrice();
		List<Product> plist = null;
		
		
		if (Util.isNullOrEmpty(name) && Util.isNullOrEmpty(price)) {
			plist = productService.findAll();

		}else if (!Util.isNullOrEmpty(name) && !Util.isNullOrEmpty(price)) {
			plist = productService.findByNamePrice(name, price);

		} else{
			if (!Util.isNullOrEmpty(name)) {
				plist = productService.findByName(name);

			}else if(!Util.isNullOrEmpty(price)) {
				plist = productService.findByPrice(price);
			}
		}

		if (plist == null || plist.equals(null)) {
			model.addAttribute("msg",message.getMessage("msg_error", null, Locale.getDefault()));
    		return "index";
    	}else {
    		model.addAttribute("product",plist);
    		return "searchResult";
    		
    	}
    	
    }
    
    @RequestMapping(value="/productResult", method=RequestMethod.POST ,params="register")
    public String add(@Validated @ModelAttribute("res") ProductForm form, BindingResult bindingResult, Model model) {
    	if (bindingResult.hasErrors()) {
	        return "index";
	    }
    	
    	String name = form.getName();
    	Integer price = form.getPrice();
    	var count= productService.insert(name, price);
    	model.addAttribute("msg",count + "件登録しました");
    	return "insertResult";
    }
    
    @RequestMapping(value="/back", method=RequestMethod.GET)
    public String back(@ModelAttribute("res") ProductForm form, Model model) {
    	return "index";
    }
}
