package com.Local.ServiceMgr;

import com.Localconnect.Bean.LoginRequestBean;
import com.Localconnect.Bean.ResponseBean;

public interface LoginServiceMgr {
	
	public ResponseBean login(LoginRequestBean loginRequestBean);

}
