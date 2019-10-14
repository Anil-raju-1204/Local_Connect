package com.Local.service;

import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Local.ServiceMgr.LoginServiceMgr;
import com.Localconnect.Bean.LoginRequestBean;
import com.Localconnect.Bean.ResponseBean;


@RestController
@CrossOrigin
@RequestMapping("user")
public class LoginService {
	
	@Autowired
	LoginServiceMgr loginServiceMgr;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public ResponseBean login(@RequestBody LoginRequestBean loginRequestBean ) {
		
		ResponseBean resp = new ResponseBean();
		
		if(TextUtils.isEmpty(loginRequestBean.getMobileno())) {
			resp.setIsValid(true);
			resp.setMessage("Mobile Number is Mandatory...");
		}else if(TextUtils.isEmpty(loginRequestBean.getPassword())) {
			resp.setIsValid(true);
			resp.setMessage("Password is Mandatory..");
		}else {
			 resp =loginServiceMgr.login(loginRequestBean);
		}
		return resp;
		
	}
	

}
