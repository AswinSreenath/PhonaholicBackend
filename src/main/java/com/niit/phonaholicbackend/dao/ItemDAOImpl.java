package com.niit.phonaholicbackend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.phonaholicbackend.model.Cart;
import com.niit.phonaholicbackend.model.Item;
import com.niit.phonaholicbackend.model.Product;
@Repository("itemDAO")
@Transactional
@EnableTransactionManagement
public class ItemDAOImpl implements ItemDAO {
	@Autowired
	SessionFactory sessionFactory;

	
	public void addItem(Item item) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(item);
		
		
	}

	
	public void removeItem(Item item) {
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("delete from Item where itemid="+item.getItemid()).executeUpdate();

	}

	
	public Item getItemById(int itemid) {
		Session session=sessionFactory.getCurrentSession();
		Item item=(Item) session.createQuery("from Item where itemid="+itemid).getSingleResult();
		return item;
	}

	
	public void removeAllItem(Cart cart) {
		Session session=sessionFactory.getCurrentSession();
		session.createQuery("delete from Item where cartid="+cart.getCartid()).executeUpdate();
		
	}

	
	public void updateItem(Item item) {
		
		Session session=sessionFactory.getCurrentSession();
		session.update(item);
	}


	
	public List<Item> gettheItems(int cartid) {
		Session session=sessionFactory.getCurrentSession();
		List<Item> itemlist=session.createQuery("from Item where cartid="+cartid).getResultList();
		return itemlist;
	}


	

}
