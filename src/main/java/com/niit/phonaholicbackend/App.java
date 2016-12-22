package com.niit.phonaholicbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.phonaholicbackend.config.AppContext;
import com.niit.phonaholicbackend.dao.ItemDAO;
import com.niit.phonaholicbackend.dao.ProductDAO;
import com.niit.phonaholicbackend.dao.UserDAO;
import com.niit.phonaholicbackend.dao.UserOrderDAO;
import com.niit.phonaholicbackend.model.Cart;
import com.niit.phonaholicbackend.model.Item;
import com.niit.phonaholicbackend.model.Product;
import com.niit.phonaholicbackend.model.User;
import com.niit.phonaholicbackend.model.UserOrder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		ItemDAO itemDAO = (ItemDAO) context.getBean("itemDAO");
		UserOrderDAO userorderDAO=(UserOrderDAO) context.getBean("userorderDAO");

		/*
		 * User user=new User(); user.setName("sura"); user.setPassword("sura");
		 * user.setUsername("sura"); user.setAddress("ulli");
		 * 
		 * userDAO.addUser(user);
		 * 
		 * Product product=new Product(); product.setName("HTC");
		 * product.setBrand("HTC"); product.setCategory("Android Phones");
		 * product.setDesc("sadhaskjhnjdsa");
		 * 
		 * productDAO.addProduct(product);
		 */

		/*
		 * Item item=new Item();
		 * 
		 * item.setProduct(productDAO.getProductById(2)); item.setQuantity(1);
		 * item.setCart(userDAO.getUserByUsername("sura").getCart());
		 * item.setItemtotal(item.getProduct().getPrice()*item.getQuantity());
		 * 
		 * itemDAO.addItem(item);
		 */

		/*User user = userDAO.getUserByUsername("sura");
		Cart cart = user.getCart();
		System.out.println(cart.getCartid());
		Product product = productDAO.getProductById(3);	
		List<Item> itemlist = cart.getItems();
		System.out.println(itemlist.isEmpty());
		System.out.println(itemlist.size());
		for (int i = 0; i < itemlist.size(); i++) {
			if (itemlist.get(i).getProduct().getPid() == product.getPid()) {
				Item item = itemlist.get(i);
				item.setQuantity(item.getQuantity() + 1);
				item.setItemtotal(item.getQuantity() * item.getProduct().getPrice());
				itemDAO.addItem(item);
				return;
			}
				
			
		}
		
		Item item = new Item();
		item.setProduct(product)	;
		item.setQuantity(1);
		item.setCart(cart);
		item.setItemtotal(item.getProduct().getPrice() * item.getQuantity());
		System.out.println(cart.getCartid()+" "+item.getItemtotal()+" "+product.getPid()+" "+item.getQuantity());
		itemDAO.addItem(item);*/
		
		/*UserOrder userorder=new UserOrder();
		userorder.setUser(userDAO.getUserByUsername("sura"));
		userorder.setCart(userDAO.getUserByUsername("sura").getCart());
		userorderDAO.addOrder(userorder);*/
		
		
		
		
		
		
		
	}
}
