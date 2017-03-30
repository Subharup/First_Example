package com.niit.shopping.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.shopping.model.User;
@Repository("userDao")
@Transactional

public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	protected Session getSession() {
		return sessionFactory.openSession();
	}
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		Session session = getSession();

		Query query = session.createQuery("from User");
		List<User> List1 = query.list();

		return List1;

	}

	
	public void addUser(User user) {
		Session session = getSession();

		String s = user.getName();

		session.save(user);

		session.flush();

		session.close();

	}
	public User getUsersById(String id) {
		Session session = getSession();

		Query query = session.createQuery("from User where Id=?");
		
		query.setString(0, id);
	List<User> user = query.list();
	
	if (user!=null &&  ! user.isEmpty())
	

		return user.get(0);
	
	else return null;

	}
	public void editUsers(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
}
