package com.niit.phonaholicbackend.dao;

import com.niit.phonaholicbackend.model.UserOrder;

public interface UserOrderDAO {

	public void addOrder(UserOrder userOrder);
	public UserOrder getUserOrderById(int userorderid);
	public void remOrder(int userorderid);

}
