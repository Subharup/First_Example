package com.niit.shopping.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopping.model.Cart;
@Repository("cartDao")
@Transactional

public class CartDaoImpl implements CartDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.openSession();
	}

	@Transactional
	public boolean saveOrUpdate(Cart cart) {
		try{
			Session session = getSession();
			session.saveOrUpdate(cart);
			session.flush();
			session.close();
			
			return true;
			
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}
	}


	public boolean delete(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}
@Transactional
	public Cart getCartByUserId(String userId) {
String hql = "from Cart where user.userId=" + "'" + userId + "'";
		
		Session session = getSession();
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		
		List<Cart> list = query.list();
		
		if(list == null || list.isEmpty())
		{
			session.flush();
			session.close();
			return null;
		}
		else
		{
			session.flush();
			session.close();
			return list.get(0);
		}
	}

public void addCart(Cart cart) {
	// TODO Auto-generated method stub
	
}

}
