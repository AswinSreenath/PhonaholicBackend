package com.niit.phonaholicbackend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.phonaholicbackend.model.ShippingAddress;
@Repository("shippingAddressDAO")
@Transactional
@EnableTransactionManagement



public class ShippingAddressDAOImpl implements ShippingAddressDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addshippingaddress(ShippingAddress shippingAddress) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(shippingAddress);
		
		
	}

	@Override
	public void updateshippingaddress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeshippingaddress(ShippingAddress shippingAddress) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(shippingAddress);
		
	}

	@Override
	public ShippingAddress getShippingAddressById(int useraddressid) {
		Session session=sessionFactory.getCurrentSession();
		ShippingAddress shippingAdress=(ShippingAddress) session.createQuery("from ShippingAddress where useraddressid="+useraddressid).getSingleResult();
		return shippingAdress;
	}

}
