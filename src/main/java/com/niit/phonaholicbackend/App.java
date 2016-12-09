package com.niit.phonaholicbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.niit.phonaholicbackend.config.AppContext;
import com.niit.phonaholicbackend.dao.ProductDAO;
import com.niit.phonaholicbackend.dao.UserDAO;
import com.niit.phonaholicbackend.model.Product;
import com.niit.phonaholicbackend.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContext.class);
        ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
        UserDAO userDAO=(UserDAO) context.getBean("userDAO");
        
        Product product=new Product();
        product.setName("HTC");
        product.setBrand("HTC");
        product.setCategory("Android Phones");
        product.setDesc("sadhaskjhnjdsa");
        
        productDAO.addProduct(product);
        
        
    }
}
