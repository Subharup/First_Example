package com.niit.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 

public class Homecontroller {
@RequestMapping("/Log")
public ModelAndView Login(){
	ModelAndView model=new ModelAndView("Log");
	return model;
}

@RequestMapping("/Home")
public ModelAndView Home(){
	ModelAndView model=new ModelAndView("Home");
	return model;
}
@RequestMapping("/Register")
public ModelAndView Register(){
	ModelAndView Register=new ModelAndView("Register");
	return Register;
}

@RequestMapping("/CartDetails")
public ModelAndView CartDetails(){
	ModelAndView CartDetails=new ModelAndView("CartDetails");
	return CartDetails;
}

}
