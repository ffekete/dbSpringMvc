package com.epam.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@ModelAttribute("message")
	public String message(){
		String msg = new String("Dat ash!");
		return msg;
	}
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String index(){
		
		return "index";
	}
}
