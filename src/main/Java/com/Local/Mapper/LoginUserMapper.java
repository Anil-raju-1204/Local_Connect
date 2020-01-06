package com.Local.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Localconnect.Bean.UserInfoResponse;

public class LoginUserMapper implements RowMapper<UserInfoResponse>{

	@Override
	public UserInfoResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserInfoResponse user= new UserInfoResponse();
		
		user.setUserName(rs.getString("u.user_name"));
		user.setUserMobileNo(rs.getString("u.user_mobile_number"));
		
		return user;
	}

}
