package com.niit.shopping.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Cart implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	private Double grandTotal;
	

@OneToMany(mappedBy="cart",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
private List<CartItem> cartItems;
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public Double getGrandTotal() {
	return grandTotal;
}
public void setGrandTotal(Double grandTotal) {
	this.grandTotal = grandTotal;
}

public List<CartItem> getCartItems() {
	return cartItems;
}
public void setCartItems(List<CartItem> cartItems) {
	this.cartItems = cartItems;
}

}

