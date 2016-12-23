package com.niit.phonaholicbackend.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ShippingAdress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int useraddressid;

	private String phonenumber;
	private String city;
	private String district;
	private String state;
	private String pin;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	User user;

	public int getUseraddressid() {
		return useraddressid;
	}

	public void setUseraddressid(int useraddressid) {
		this.useraddressid = useraddressid;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
