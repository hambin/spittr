package com.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/","/index"})
public class HelloController {

	@RequestMapping(method=RequestMethod.GET)
	public String hello(ModelMap model){
		return "home";
	}
	
/*	@ModelAttribute("halo")
	public String showString(){
		return "spittr";
	}*/
}
