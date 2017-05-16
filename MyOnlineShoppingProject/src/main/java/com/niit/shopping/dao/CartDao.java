package com.niit.shopping.dao;

import java.util.List;

import com.niit.shopping.model.Cart;
import com.niit.shopping.model.CartItem;

public interface CartDao {
public boolean saveOrUpdate(Cart cart);
	
	public boolean delete(Cart cart);
	
	public Cart getCartByUserId(String userId);
	public List<CartItem> getCartItemsByCartId(int  cartId);

	public void addCart(Cart cart);

}
