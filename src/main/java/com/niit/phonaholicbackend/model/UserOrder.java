package com.niit.phonaholicbackend.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userorderid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cartid")
	private Cart cart;
	@OneToOne
	@JoinColumn(name = "userid")
	private User user;

	public int getUserorderid() {
		return userorderid;
	}

	public void setUserorderid(int userorderid) {
		this.userorderid = userorderid;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
