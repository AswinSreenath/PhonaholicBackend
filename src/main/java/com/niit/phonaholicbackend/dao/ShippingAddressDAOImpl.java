package com.niit.phonaholicbackend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.phonaholicbackend.model.ShippingAddress;
import com.niit.phonaholicbackend.model.User;

@Repository("shippingAddressDAO")
@Transactional
@EnableTransactionManagement

public class ShippingAddressDAOImpl implements ShippingAddressDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	UserDAO userDAO;

	public void addshippingaddress(User user) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user.getShippingAddress());

	}

	public void updateshippingaddress(ShippingAddress shippingAddress) {

	} 

	@Override
	public void removeshippingaddress(ShippingAddress shippingAddress) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(shippingAddress);

	}

	@Override
	public ShippingAddress getShippingAddressById(int useraddressid) {
		Session session = sessionFactory.getCurrentSession();
		ShippingAddress shippingAdress = (ShippingAddress) session
				.createQuery("from ShippingAddress where useraddressid=" + useraddressid).getSingleResult();
		return shippingAdress;
	}

}
