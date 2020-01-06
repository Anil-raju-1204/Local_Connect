package com.Local.DaoImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Local.Dao.LoginDao;
import com.Local.Mapper.LoginUserMapper;
import com.Local.Utils.Utils;
import com.Localconnect.Bean.LoginRequestBean;
import com.Localconnect.Bean.ResponseBean;
import com.Localconnect.Bean.SignUpRequestBean;
import com.Localconnect.Bean.UserInfoResponse;
import com.google.gson.Gson;

@Transactional
@Repository
public class LoginDaoImpl implements LoginDao {

private static final Logger LOGGER = LoggerFactory.getLogger(LoginDaoImpl.class);
	

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ResponseBean login(LoginRequestBean loginRequestBean) {
		
		LOGGER.info(new Gson().toJson(loginRequestBean));
		
		ResponseBean resp = new ResponseBean();
		
		String sql ="select u.user_name,u.user_mobile_number from user u\n" + 
				"WHERE u.user_mobile_number=? and u.user_password= ? and user_status='ACTIVE'";
		
		try {
			List<UserInfoResponse> list=jdbcTemplate.query(sql, new LoginUserMapper(),loginRequestBean.getMobileno(),loginRequestBean.getPassword());
			
			if(list.isEmpty() && list.size()>0) {
				resp.setIsValid(true);
				
				//Calling JWT to create Token.
				String jwt = Utils.createJWT(loginRequestBean);
				
				resp.setUserinfo(list);
				resp.setJwtToken(jwt);
			}else {
				resp.setIsValid(false);
				resp.setMessage("User Not Found..");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}

	
	
	@Override
	public ResponseBean signUp(SignUpRequestBean signUpRequest) {
		return null;
	}



	
	
	
	
		
		

}
