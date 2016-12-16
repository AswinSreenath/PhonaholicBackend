package com.niit.phonaholicbackend.dao;

import java.util.List;

import com.niit.phonaholicbackend.model.Product;

public interface ProductDAO {
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public List<Product> listProducts();
	public List<Product> listProductsByCategory(String category);
	public Product getProductById(int pid);
	public void removeProduct(int pid);
	

}
