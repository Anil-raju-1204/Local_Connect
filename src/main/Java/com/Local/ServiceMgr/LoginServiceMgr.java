package com.Local.ServiceMgr;

import com.Localconnect.Bean.LoginRequestBean;
import com.Localconnect.Bean.ResponseBean;
import com.Localconnect.Bean.SignUpRequestBean;

public interface LoginServiceMgr {
	
	public ResponseBean login(LoginRequestBean loginRequestBean);
	
	public ResponseBean signUp(SignUpRequestBean signUpRequest);

}
