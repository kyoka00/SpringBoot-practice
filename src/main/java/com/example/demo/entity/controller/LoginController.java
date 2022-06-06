package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
	@RequestMapping(value={"/","/top"})
	public String top(Model model) {
		return "index";
	}
	
    @RequestMapping(value="/start", method=RequestMethod.GET)
    public String index(@ModelAttribute("loginform") LoginForm form,Model model) {
     return "login";
    }
    
    @RequestMapping(value="login", method=RequestMethod.POST)
    public String login(@ModelAttribute("loginform") LoginForm form, BindingResult bindingResult, Model model) {
    	String loginId = form.getLoginId();
    	String password = form.getPassword();
    	if(loginId.equals("axiz") && password.equals("axizuser")) {
    		return "menu";
    	}else {
    		model.addAttribute("msg","ログインに失敗しました。");
    	}
    	return "login";
    }
    @RequestMapping(value="back", method=RequestMethod.GET)
    public String back(@ModelAttribute("loginform") LoginForm form, Model model) {
    	return "index";
    }
    
    @RequestMapping(value="backToLogin", method=RequestMethod.GET)
    public String backToLogin(@ModelAttribute("loginform") LoginForm form, Model model) {
    	return "login";
    }
}
