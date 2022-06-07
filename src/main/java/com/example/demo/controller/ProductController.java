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
import com.example.demo.service.DeleteService;
import com.example.demo.service.UpdateService;


@Controller
public class ProductController {
	@Autowired
	MessageSource message;
	
	@Autowired
	DeleteService deleteService;
	
	@Autowired
	UpdateService updateService;
	
    @RequestMapping("/deleteMenu")
    public String deleteindex(@ModelAttribute("deleteForm") DeleteForm form,Model model) {
    	
        return "delete";
    }
    @RequestMapping("/updateMenu")
    public String updateindex(@ModelAttribute("res") ProductForm form,Model model) {
    	
        return "update";
    }
    
    @RequestMapping(value="delete", method=RequestMethod.GET)
    public String delete(@Validated @ModelAttribute("deleteForm") DeleteForm form,BindingResult bindingResult, Model model) {
    	if (bindingResult.hasErrors()) {
	        return "delete";
	    }
    	int count = deleteService.delete(form.getId());
    	if(count== 0) {
    		model.addAttribute("msg",message.getMessage("msg_error", null, Locale.getDefault()));
    		return "delete";
    		
    	}else {
    		model.addAttribute("msg",message.getMessage("delete_msg", null, Locale.getDefault()));
    		return "deleteResult";
    		
    	}
    	
    }
    @RequestMapping(value="update", method=RequestMethod.POST)
    public String update(@Validated @ModelAttribute("res")ProductForm form, BindingResult bindingResult, Model model) {
    	if (bindingResult.hasErrors()) {
	        return "update";
	    }
    	Product p = new Product(form.getId(),form.getName(),form.getPrice());
    	try {
    		List<Product> result  = updateService.update(p);
    		if(result==null || result.size()==0) {
    			model.addAttribute("msg",message.getMessage("msg_error", null, Locale.getDefault()));
        		return "update";
    		}
    		model.addAttribute("beforeValue", result.get(0));
    		model.addAttribute("afterValue", result.get(1));
    		return "updateResult";
    		
    	}catch(Exception e){
    		model.addAttribute("msg",message.getMessage("msg_error", null, Locale.getDefault()));
    		return "update";
    	}
    		
    }

    @RequestMapping(value="/deleteback", method=RequestMethod.GET)
    public String detleteback(@ModelAttribute("deleteForm") DeleteForm form, Model model) {
    	return "delete";
    }

    @RequestMapping(value="/updateback", method=RequestMethod.GET)
    public String back(@ModelAttribute("res") ProductForm form, Model model) {
    	return "update";
    }
    
}
