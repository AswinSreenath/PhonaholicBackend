package com.niit.phonaholicbackend.dao;

import java.util.List;

import com.niit.phonaholicbackend.model.Cart;
import com.niit.phonaholicbackend.model.Item;

public interface ItemDAO {
	public void addItem(Item item);
	public void updateItem(Item item);
	public void removeItem(Item item);
	public void removeAllItem(Cart cart);
	public Item getItemById(int itemid);
	public List<Item> gettheItems(int cartid );
	

}
