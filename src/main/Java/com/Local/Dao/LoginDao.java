package com.Local.Dao;

import com.Localconnect.Bean.LoginRequestBean;
import com.Localconnect.Bean.ResponseBean;

public interface LoginDao {
	
	public ResponseBean login(LoginRequestBean loginRequestBean);

}
