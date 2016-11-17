package com.spittr.web;

import com.spittr.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegistationForm(){
		return "registerForm";
	}

//	@RequestMapping(value="register", method=RequestMethod.POST)
//	public String processRegistration(
//		@RequestPart("profilePicture") byte[] profilePicture, @Valid Spitter spitter,Errors errors
//	){}
}
