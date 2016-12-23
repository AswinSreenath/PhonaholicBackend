package com.niit.phonaholicbackend.dao;

import com.niit.phonaholicbackend.model.ShippingAdress;

public interface ShippingAddressDAO {

	public void addshippingaddress(ShippingAdress shippingaddress);

	public void updateshippingaddress();

	public void removeshippingaddress(ShippingAdress shippingaddress);

	public ShippingAdress getShippingAddressById(int useraddressid);

}
