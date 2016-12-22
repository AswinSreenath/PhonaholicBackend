package com.niit.phonaholicbackend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.phonaholicbackend.model.UserOrder;

@Repository("userorderDAO")
@Transactional
@EnableTransactionManagement
public class UserOrderDAOImpl implements UserOrderDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void addOrder(UserOrder userOrder) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(userOrder);

	}

}
