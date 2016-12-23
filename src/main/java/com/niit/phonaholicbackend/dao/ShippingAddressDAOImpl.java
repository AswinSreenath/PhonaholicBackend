package com.niit.phonaholicbackend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.phonaholicbackend.model.ShippingAdress;
@Repository("shippingaddressDAO")
@Transactional
@EnableTransactionManagement



public class ShippingAddressDAOImpl implements ShippingAddressDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addshippingaddress(ShippingAdress shippingaddress) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(shippingaddress);
		
		
	}

	@Override
	public void updateshippingaddress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeshippingaddress(ShippingAdress shippingaddress) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(shippingaddress);
		
	}

	@Override
	public ShippingAdress getShippingAddressById(int useraddressid) {
		Session session=sessionFactory.getCurrentSession();
		ShippingAdress shippingadress=(ShippingAdress) session.createQuery("from ShippingAddress where useraddressid="+useraddressid).getSingleResult();
		return shippingadress;
	}

}
