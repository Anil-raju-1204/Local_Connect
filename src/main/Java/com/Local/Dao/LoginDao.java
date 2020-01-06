package com.Local.Dao;

import com.Localconnect.Bean.LoginRequestBean;
import com.Localconnect.Bean.ResponseBean;
import com.Localconnect.Bean.SignUpRequestBean;

public interface LoginDao {
	
	public ResponseBean login(LoginRequestBean loginRequestBean);
	
	public ResponseBean signUp(SignUpRequestBean signUpRequest);
	

}
