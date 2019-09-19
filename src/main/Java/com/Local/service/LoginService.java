package com.Local.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Local.ServiceMgr.LoginServiceMgr;

@RestController
@CrossOrigin
@RequestMapping("login")
public class LoginService {
	
	@Autowired
	LoginServiceMgr loginServiceMgr;

}
