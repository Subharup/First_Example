package com.niit.shopping.dao;

import java.util.List;



import com.niit.shopping.model.User;


public interface UserDao {

	void addUser(User user);
	List<User> getAllUser();
	User getUsersById(String id);
	void editUsers(User user);

}
