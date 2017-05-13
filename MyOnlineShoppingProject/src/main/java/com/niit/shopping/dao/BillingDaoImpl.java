package com.niit.shopping.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.GeneratorStrategy;
import org.springframework.stereotype.Repository;

import com.niit.shopping.model.Billing;

public class BillingDaoImpl implements BillingDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public void addBilling(Billing billing) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String Billing=billing.getBillingName();
		session.save(billing);
		session.flush();
		session.close();


	}
	//public List<Billing> getAllBilling() {
		// TODO Auto-generated method stub
		//Session session = getSession();

		//Query query = session.createQuery("from Billing");
		//List<Billing> billingList = query.list();

		//return billingList;

	//}

}
