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

	public CartItem get(String cartItemId) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<CartItem> getCartItemByCartId(String cartId) {
		Session session = getSession();

		Query query = session.createQuery("from CartItem where cartItemId=?");
		
		query.setString(0, cartId);
	List<CartItem> cartItem = query.list();
	
	if (cartItem!=null &&  ! cartItem.isEmpty())
	

		return (List<CartItem>) cartItem.get(0);
	
	else return null;
	}

	
}
