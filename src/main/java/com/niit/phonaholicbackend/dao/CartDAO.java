package com.niit.phonaholicbackend.dao;

import com.niit.phonaholicbackend.model.Cart;

public interface CartDAO {
	public void addCart(Cart cart);

	public void updateCart(Cart cart);

	public Cart getCartById(int cartid);

}
