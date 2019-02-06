package com.food.order.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.order.login.model.LoginRequest;
import com.food.order.login.model.User;
import com.food.order.login.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;

	public User login(final LoginRequest request) {
		System.out.println("LoginService.login()");
		return loginRepository.login(request);
	}
}
