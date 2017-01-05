package com.niit.phonaholicbackend.dao;

import com.niit.phonaholicbackend.model.ShippingAddress;

public interface ShippingAddressDAO {

	public void addshippingaddress(ShippingAddress shippingAddress);

	public void updateshippingaddress();

	public void removeshippingaddress(ShippingAddress shippingAddress);

	public ShippingAddress getShippingAddressById(int useraddressid);

}
