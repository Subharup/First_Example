package com.niit.shopping.dao;

import java.util.List;

import com.niit.shopping.model.CartItem;

public interface CartItemDao {
public boolean saveOrUpdate(CartItem cartItem);
	
	public boolean delete(CartItem cartItem);
	
	public CartItem get(Integer cartItemId);
	
	public List<CartItem> getCartItemByCartId(int i);
	public void deleteItems(int cartItemId);
	
}
