package com.Local.service;

import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Local.ServiceMgr.LoginServiceMgr;
import com.Localconnect.Bean.LoginRequestBean;
import com.Localconnect.Bean.ResponseBean;
import com.Localconnect.Bean.SignUpRequestBean;

@RestController
@CrossOrigin
@RequestMapping("user")
public class LoginService {
	
	@Autowired
	LoginServiceMgr loginServiceMgr;
	
	
	@PostMapping(value = "/login", produces = "application/json")
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
	
	@PostMapping(value = "/create/user", produces = "application/json")
	public ResponseBean signUp(@RequestBody SignUpRequestBean signUpRequest) {
		
		ResponseBean resp = new ResponseBean();
		if(TextUtils.isEmpty(signUpRequest.getPhonenumber())) {
			resp.setIsValid(true);
			resp.setMessage("Mobile Number is Mandatory...");
			return resp;
		}
		if(TextUtils.isEmpty(signUpRequest.getPassword())) {
			resp.setIsValid(true);
			resp.setMessage("Password is Missing");
			return resp;
		}
		
		return loginServiceMgr.signUp(signUpRequest);
		
	}
	
	@GetMapping(value = "Verify/otp", produces = "application/json")
	public String verify(@RequestBody SignUpRequestBean signUpRequest) {
		
		return loginServiceMgr.signUp(signUpRequest);
		
	}
	
	
	
	
	

	
	
	
	
	


}
