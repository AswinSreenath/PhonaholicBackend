package com.niit.phonaholicbackend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.phonaholicbackend.model.UserOrder;

@Repository("userOrderDAO")
@Transactional
@EnableTransactionManagement
public class UserOrderDAOImpl implements UserOrderDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void addOrder(UserOrder userOrder) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(userOrder);

	}

	
	public UserOrder getUserOrderById(int userorderid) {
		Session session=sessionFactory.getCurrentSession();
		UserOrder userOrder=(UserOrder)session.createQuery("from UserOrder where userorderid="+userorderid).getSingleResult();
		return userOrder;
	}


	
	public void remOrder(int userorderid) {
		
		Session session=sessionFactory.getCurrentSession();
		session.createQuery("delete from UserOrder where userorderid="+userorderid ).executeUpdate();
		
		
	}

}
