package com.niit.shopping.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Billing implements Serializable {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int billingId;
	
	public int getBillingId() {
		return billingId;
	}
	public double getBillingAmount() {
		return billingAmount;
	}
	public void setBillingAmount(double billingAmount) {
		this.billingAmount = billingAmount;
	}
	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}
	private double billingAmount;
	private String billingAddress;
	private int contactNumber;
	@OneToOne
	@JoinColumn(name="id")
	User user;
	
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	}
