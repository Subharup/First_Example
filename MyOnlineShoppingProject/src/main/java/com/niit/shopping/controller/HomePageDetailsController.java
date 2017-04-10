package com.niit.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomePageDetailsController {
	@RequestMapping("aboutUs")
	public ModelAndView aboutUs(){
		ModelAndView aboutUs=new ModelAndView("aboutUs");
		return aboutUs;
	}
	@RequestMapping("contactUs")
	public ModelAndView contactUs(){
		ModelAndView contactUs=new ModelAndView("contactUs");
		return contactUs;
	}
}
