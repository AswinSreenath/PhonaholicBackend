package com.niit.phonaholicbackend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.phonaholicbackend.model.Cart;
import com.niit.phonaholicbackend.model.ShippingAddress;
import com.niit.phonaholicbackend.model.User;

@Repository("userDAO")
@Transactional
@EnableTransactionManagement
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		user.setEnabled(true);
		user.setRole("ROLE_USER");
		Cart cart = new Cart();
		cart.setUser(user);
		user.setCart(cart);
		ShippingAddress shippingAddress=new ShippingAddress();
		shippingAddress.setUser(user);
		user.setShippingAddress(shippingAddress);
		
		session.saveOrUpdate(user);

	}

	public void updateUser(User user) {

		Session session = sessionFactory.getCurrentSession();
		session.update(user);

	}

	public void deleteUser(int userid) {

		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.createQuery("from User where userid=" + userid).getSingleResult();
		session.delete(user);

	}

	public User getUserById(int userid) {
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.createQuery("from User where userid=" + userid).getSingleResult();
		return user;

	}

	public User getUserByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.createQuery("from User where username='" + username+"'").getSingleResult();
		return user;
	}

	public List<User> listUsers() {
		Session session = sessionFactory.getCurrentSession();
		List<User> users = session.createQuery("from User").getResultList();
		return users;
	}

}
