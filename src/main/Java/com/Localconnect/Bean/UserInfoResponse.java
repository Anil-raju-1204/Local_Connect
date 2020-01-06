package com.Localconnect.Bean;

import java.io.Serializable;

public class UserInfoResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String userMobileNo;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
