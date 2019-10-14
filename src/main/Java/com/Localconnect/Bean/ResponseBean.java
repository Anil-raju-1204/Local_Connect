package com.Localconnect.Bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer count;
	private Boolean isValid;
	private String message;
	
	private List<UserInfoResponse> userinfo;
	
	
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<UserInfoResponse> getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(List<UserInfoResponse> userinfo) {
		this.userinfo = userinfo;
	}
	
	

}
