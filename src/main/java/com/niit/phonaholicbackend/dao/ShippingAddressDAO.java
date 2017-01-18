package com.niit.phonaholicbackend.dao;

import com.niit.phonaholicbackend.model.ShippingAddress;
import com.niit.phonaholicbackend.model.User;

public interface ShippingAddressDAO {

	public void addshippingaddress(User user);

	public void updateshippingaddress(ShippingAddress shippingAddress);

	public void removeshippingaddress(ShippingAddress shippingAddress);

	public ShippingAddress getShippingAddressById(int useraddressid);

}
