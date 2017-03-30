package com.niit.shopping.dao;

import com.niit.shopping.model.Cart;

public interface CartDao {
public boolean saveOrUpdate(Cart cart);
	
	public boolean delete(Cart cart);
	
	public Cart getCartByUserId(String userId);

	public void addCart(Cart cart);

}
