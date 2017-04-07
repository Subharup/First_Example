package com.niit.shopping.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopping.model.CartItem;
import com.niit.shopping.model.Product;
import com.niit.shopping.model.User;
@Repository("cartItemDao")
@Transactional

public class CartItemDaoImpl implements CartItemDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.openSession();
	}
@Transactional
	public boolean saveOrUpdate(CartItem cartItem) {
		try{
			Session session = getSession();
			session.saveOrUpdate(cartItem);
			session.flush();
			session.close();
			
			return true;
			
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}

	}

	public boolean delete(CartItem cartItem) {
		// TODO Auto-generated method stub
		return false;
	}

	public CartItem get(Integer cartItemId) {
		Session session = getSession();
		
		return (CartItem) session.get(CartItem.class, cartItemId);
	}
	public List<CartItem> getCartItemByCartId(String cartId) {
		Session session = getSession();

		Query query = session.createQuery("from CartItem where  cart.cartId=?");
		
		query.setString(0, cartId);
		List<CartItem> CartItemList = query.list();

		return CartItemList;
	}

	public void deleteItems(int cartItemId) {
		Session session = getSession();

		Query query = session.createQuery("from CartItem where cartItemId = ?");
		query.setInteger(0, cartItemId);
		CartItem c=(CartItem) query.uniqueResult();
		session.delete(c);
		session.flush();

		session.close();

		

		
	}
}
