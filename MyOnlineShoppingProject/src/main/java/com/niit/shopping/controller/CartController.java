package com.niit.shopping.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.dao.CartDao;
import com.niit.shopping.dao.CartItemDao;
import com.niit.shopping.dao.ProductDao;
import com.niit.shopping.dao.UserDao;
import com.niit.shopping.model.Cart;
import com.niit.shopping.model.CartItem;
import com.niit.shopping.model.Product;
import com.niit.shopping.model.User;

@Controller
public class CartController {

	  @Autowired 
	  UserDao userDao;
	  @Autowired
	  CartDao cartDao;
	  @Autowired
	  ProductDao productDao;
	  @Autowired
	  CartItemDao cartItemDao;
	  
	
	
   
   @RequestMapping(value="/cartItem",method = RequestMethod.POST)  
   public ModelAndView CartItem(@ModelAttribute("cartItem") CartItem cartItem){
	   cartItem.setStatus("new");
	return new ModelAndView("redirect:/home");
   
   
     	
   }
   
   @RequestMapping("/cart")
	public ModelAndView cart(){
		ModelAndView cart=new ModelAndView("cart");
		return cart;
	}
   
   @RequestMapping("/cart/showCart")
   public ModelAndView showCart(HttpSession session,Principal user) {
   		 
   		 String id=user.getName();
   		 
   		 User u=userDao.getUsersById(id);
   		 
   		 
   		 Cart cart = (Cart)session.getAttribute("cart");
   		 
   		 if(cart==null)
   		 {
   			 Cart c=u.getCart();
   			 session.setAttribute("cart", c);
   			 cart = (Cart)session.getAttribute("cart");
   		 }
   		 
   		 
   		 System.out.println("Id "+cart.getCartId());
   		 
   		
   		 List <CartItem> newCartItems=cartItemDao.getCartItemByCartId(cart.getCartId());
   		 
   		 
   		 return new ModelAndView("cart", "list", newCartItems);
   		
   		}
   
   //private void updateCart(CartItem cartItem)
	 //{
		 //Cart c1=cartItem.getCart();
		 //c1.setGrandTotal(c1.getGrandTotal()+cartItem.getProduct().getProductPrice());
		 //cartDao.saveOrUpdate(c1);
	// }


   @RequestMapping("/cart/addItem/{productId}")
	 public ModelAndView addItemToCart(@PathVariable int productId, Principal principal, HttpSession session){
		 
	   ModelAndView mv = new ModelAndView("redirect:/cart/showCart");
		 String id = principal.getName();
		 System.out.println("logged in user "+id);
		 Product product = productDao.getProductByProductId(productId);
		 User u=userDao.getUsersById(id);
		 //Cart cart = cartDao.getCartByUserId(id);
		 Cart cart=u.getCart();
		 if(cart==null)
		 {
			 System.out.println("No cart ");
			 Cart c = new Cart();
			 User user = userDao.getUsersById(id);
			 
			 
			 cartDao.saveOrUpdate(c);
			 user.setCart(c);
			 userDao.editUsers(user);
			 
			 CartItem cartItem = new CartItem();
			 cartItem.setCart(c);
			 cartItem.setProduct(product);
			 cartItem.setQuantity(1);
			 cartItem.setSubTotal(product.getProductPrice());
			 cartItem.setStatus("N");
			 cartItemDao.saveOrUpdate(cartItem);
			 //updateCart(cartItem);
			 session.setAttribute("cart", cartItem.getCart());
			 
			 return mv;
		 }
		 
		 System.out.println("Yes cart");
		 
		 List <CartItem> cartItems = cart.getCartItems();
		 
		 for(CartItem cartItem:cartItems)
		 {
			if(cartItem.getProduct().getProductId()==productId)
			{
				cartItem.setQuantity(cartItem.getQuantity()+1);
				cartItem.setSubTotal(cartItem.getSubTotal()+product.getProductPrice());
				cartItemDao.saveOrUpdate(cartItem);
				//updateCart(cartItem);
				session.setAttribute("cart", cartItem.getCart());
				return mv;
			}
		 }
		 
		 CartItem item = new CartItem();
		 item.setCart(cart);
		 item.setProduct(product);
		 item.setQuantity(1);
		 item.setSubTotal(product.getProductPrice());
		 item.setStatus("N");
		 cartItemDao.saveOrUpdate(item);
		// updateCart(item);
		 session.setAttribute("cart", item.getCart());
		 return mv;
		 
	 }
	
   @RequestMapping(value="/deleteItems/{cartItemId}",method = RequestMethod.GET)  
	public ModelAndView deleteItems(@PathVariable Integer cartItemId ,Principal user, HttpSession session){ 
	   
	   
	   User u=userDao.getUsersById(user.getName());
		
		 Cart c=u.getCart();
		 
		 List<CartItem>  list=c.getCartItems();
		 System.out.println("Items :" +list);
		 
		 CartItem item=cartItemDao.get(cartItemId);
		 
		 System.out.println("Items are"+item);
		
		 list.remove(item);
	   
		System.out.println("delete is called");
	   cartItemDao.deleteItems(cartItemId);
	    return new ModelAndView("redirect:/cart/showCart");  
	}

   
}
