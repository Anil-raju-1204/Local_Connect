package com.Localconnect.Bean;

import java.io.Serializable;

public class SignUpRequestBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String locaton;
	private String address;
	private String phonenumber;
	private String otp;
	private String password;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocaton() {
		return locaton;
	}
	public void setLocaton(String locaton) {
		this.locaton = locaton;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
