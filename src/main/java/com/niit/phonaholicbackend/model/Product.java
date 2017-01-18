package com.niit.phonaholicbackend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	
	@Size(min=2,max=10,message="Size will be between 2 to 10 characters")
	private String name;
	@NotEmpty(message="The brand cannot be empty")
	private String brand;
	@NotEmpty(message="The category cannot be empty")
	private String category;
	@NotEmpty(message="The description cannot be empty")
	private String desc;
	@Range(min=1,message="The price cannot be empty")
	private double price;
	
	@Transient
	private MultipartFile image;
	
	
	public Product() {
		super();
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	
	

}
