package com.Local.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Local.Dao.LoginDao;
import com.Local.Mapper.LoginUserMapper;
import com.Localconnect.Bean.LoginRequestBean;
import com.Localconnect.Bean.ResponseBean;
import com.Localconnect.Bean.UserInfoResponse;

@Transactional
@Repository
public class LoginDaoImpl implements LoginDao {

//private static final Logger LOGGER = LoggerFactory.getLogger(LoginDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ResponseBean login(LoginRequestBean loginRequestBean) {
		
		ResponseBean resp = new ResponseBean();
		
		String sql ="select u.user_name,u.user_mobile_number,ut.ut_user_name from user u\n" + 
				"inner join user_type ut on u.user_type_id=ut.user_type\n" + 
				"WHERE u.user_mobile_number=? and u.user_password= ? and user_status='ACTIVE'";
		
		try {
			List<UserInfoResponse> list=jdbcTemplate.query(sql, new LoginUserMapper(),new Object []{ loginRequestBean.getMobileno(),loginRequestBean.getPassword()});
			
			if(list!=null && list.size()>0) {
				resp.setIsValid(true);
				resp.setMessage("Infomation Available");
				resp.setUserinfo(list);
			}else {
				resp.setIsValid(false);
				resp.setMessage("User Not Found..");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}

}
