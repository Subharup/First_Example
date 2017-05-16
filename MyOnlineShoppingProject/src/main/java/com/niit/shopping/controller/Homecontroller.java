package com.niit.shopping.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.dao.BillingDao;
import com.niit.shopping.dao.CartDao;
import com.niit.shopping.dao.CartItemDao;
import com.niit.shopping.dao.CategoryDao;
import com.niit.shopping.dao.UserDao;
import com.niit.shopping.model.Cart;
import com.niit.shopping.model.CartItem;
import com.niit.shopping.model.Category;
import com.niit.shopping.model.User;
import com.niit.shopping.model.Billing;;

@Controller 

public class HomeController {
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	BillingDao billingDao;
	@Autowired
	UserDao userDao;
	@Autowired
	CartDao cartDao;
	@Autowired
	CartItemDao cartItemDao;

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
public ModelAndView Billing(){  
    return new ModelAndView("Billing","command",new Billing());  
} 
@RequestMapping("billingThanking")
public ModelAndView BillingThanking(){
	ModelAndView BillingThanking=new ModelAndView("BillingThanking");
	return BillingThanking;
}
@RequestMapping(value="/billingUser",method = RequestMethod.POST)  
public ModelAndView save(@ModelAttribute("billing") Billing billing ,Principal principal,HttpSession session ){  
			
	System.out.println("aaaaaaaaaaaaaaaaaaa");
	String u=principal.getName();
			double d=(Double)session.getAttribute("tot");
			User user=userDao.getUsersById(u);
			int cart=user.getCart().getCartId();
			List<CartItem>  items=cartDao.getCartItemsByCartId(cart);
			
			for(CartItem i:items)
			{
				i.setStatus("Y");
				cartItemDao.saveOrUpdate(i);
			}
			
			
			billing.setUser(user);
			billing.setBillingAmount(d);
			System.out.println("bbb"+billing.getContactNumber());
			
	//Billing billing=new Billing();
	
	billingDao.addBilling(billing);
    return new ModelAndView("redirect:/billingThanking");
}
}
