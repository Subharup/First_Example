package com.niit.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.dao.CartDao;
import com.niit.shopping.dao.CartItemDao;
import com.niit.shopping.dao.ProductDao;
import com.niit.shopping.dao.UserDao;
import com.niit.shopping.model.Cart;
import com.niit.shopping.model.User;

@Controller
public class UserController {
	@Autowired 
	  UserDao userDao;
	  @Autowired
	  CartDao cartDao;
	  @Autowired
	  ProductDao productDao;
	  @Autowired
	  CartItemDao cartItemDao;
	  
	  @RequestMapping(value="/saveUser",method = RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute("user") User user){  
			user.setRole("ROLE_USER");		
			user.setEnabled(true);
			Cart cart=new Cart();
			
			cartDao.saveOrUpdate(cart);
			
			user.setCart(cart);
			
	    	userDao.addUser(user);
	        return new ModelAndView("redirect:/registerSuccess");
	    }
}
