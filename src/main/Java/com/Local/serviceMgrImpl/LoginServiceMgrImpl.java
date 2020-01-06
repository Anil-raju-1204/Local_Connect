package com.Local.serviceMgrImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Local.Dao.LoginDao;
import com.Local.ServiceMgr.LoginServiceMgr;
import com.Localconnect.Bean.LoginRequestBean;
import com.Localconnect.Bean.ResponseBean;
import com.Localconnect.Bean.SignUpRequestBean;

@Component
public class LoginServiceMgrImpl implements LoginServiceMgr {
	
	@Autowired
	LoginDao loginDao;

	@Override
	public ResponseBean login(LoginRequestBean loginRequestBean) {
		
		return loginDao.login(loginRequestBean);
	}

	@Override
	public ResponseBean signUp(SignUpRequestBean signUpRequest) {
		
		return loginDao.signUp(signUpRequest);
	}
	
	
	

}
