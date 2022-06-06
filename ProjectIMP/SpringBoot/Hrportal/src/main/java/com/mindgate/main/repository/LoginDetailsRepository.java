package com.mindgate.main.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDetailsRepository implements LoginDetailsRepositoryInterface {

	private JdbcTemplate jdbcTemplate;
	int resultCount;
	private static final String UPDATE_LOGINDETAILS_STRING = "UPDATE LOGIN_DETAILS SET PASSWORD  = ? "
			+ "	WHERE USER_ID  = ?";

	@Override
	public boolean setPasswordByUserId(int userId) {
		resultCount = jdbcTemplate.update(UPDATE_LOGINDETAILS_STRING, userId);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

}
