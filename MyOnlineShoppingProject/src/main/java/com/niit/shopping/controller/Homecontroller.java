package com.niit.shopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.dao.CategoryDao;
import com.niit.shopping.model.Category;
import com.niit.shopping.model.User;

@Controller 

public class Homecontroller {
	@Autowired
	CategoryDao categoryDao;

@RequestMapping("/home")
public ModelAndView Home(HttpServletRequest  request,HttpSession session){
	
	session=request.getSession();
	 List<Category> list=categoryDao.getAllCatagory();
	 session.setAttribute("categoryList", list);
	    return new ModelAndView("Home","categoryList",list);  
}
@RequestMapping("/index")
public ModelAndView index(HttpServletRequest  request,HttpSession session){
	
	session=request.getSession();
	 List<Category> list=categoryDao.getAllCatagory();
	 session.setAttribute("categoryList", list);
	    return new ModelAndView("Home","categoryList",list);  
}

@RequestMapping("registerSuccess")
public ModelAndView RegisterSuccessfull(){
	ModelAndView registerSuccess=new ModelAndView("RegisterSuccess");
	return registerSuccess;
}


@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
public ModelAndView loginPage() {

	return new ModelAndView("loginPage");
}
@RequestMapping("/register")  
public ModelAndView showform(){  
    return new ModelAndView("Register","command",new User());  
} 
 
@RequestMapping("/billing")  
public ModelAndView billing(){  
	ModelAndView BillingThanking=new ModelAndView("redirect:/billingThanking");
	return BillingThanking;
  
} 
@RequestMapping("billingThanking")
public ModelAndView BillingThanking(){
	ModelAndView BillingThanking=new ModelAndView("BillingThanking");
	return BillingThanking;
}

}
