package com.Local.serviceMgrImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Local.Dao.LoginDao;
import com.Local.ServiceMgr.LoginServiceMgr;

@Service
public class LoginServiceMgrImpl implements LoginServiceMgr {
	
	@Autowired
	LoginDao loginDao;
	
	
	

}
