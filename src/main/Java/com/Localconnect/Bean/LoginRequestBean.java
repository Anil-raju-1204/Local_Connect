package com.Localconnect.Bean;

import java.io.Serializable;

public class LoginRequestBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String mobileno;
	private String password;
	
	
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
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
