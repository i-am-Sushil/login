package com.food.order.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.food.order.login.model.LoginRequest;
import com.food.order.login.model.User;
import com.food.order.login.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User login(@RequestBody final LoginRequest request) {
		System.out.println("LoginController.register()");
		System.out.println("Values are- " + "Email:" + request.getEmail() + ", Password:" + request.getPassword());
		return loginService.login(request);
	}
}
