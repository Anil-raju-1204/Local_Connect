package com.Local.serviceMgrImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Local.Dao.LoginDao;
import com.Local.ServiceMgr.LoginServiceMgr;

@Component
public class LoginServiceMgrImpl implements LoginServiceMgr {
	
	@Autowired
	LoginDao loginDao;
	
	
	

}
