package com.mindgate.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.repository.LoginDetailsRepositoryInterface;

@Service
public class LoginDetailsService implements LoginDetailServiceInterface {

	@Autowired
	private LoginDetailsRepositoryInterface loginDetailsRepository;

	@Override
	public boolean setPasswordByUserId(int userId) {
		// TODO Auto-generated method stub
		return loginDetailsRepository.setPasswordByUserId(userId);
	}	

}
