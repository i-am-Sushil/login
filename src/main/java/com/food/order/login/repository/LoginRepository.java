package com.food.order.login.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.order.login.model.LoginRequest;
import com.food.order.login.model.User;

@Service
public class LoginRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public User login(final LoginRequest request) {
		System.out.println("LoginRepository.login()");
		final Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, request.getEmail());
		if (user == null) {
			return new User(null, request.getEmail(), Boolean.FALSE, "Not Registered");
		}
		return user;
	}
}
