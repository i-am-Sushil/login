package com.food.order.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Column(name = "name")
	private String name;
	@Id
	@Column(name = "email", nullable = false, columnDefinition = "VARCHAR(64)")
	private String email;

	private Boolean status = Boolean.TRUE;
	private String errorMessage;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String email, Boolean status, String errorMessage) {
		this.name = name;
		this.email = email;
		this.status = status;
		this.errorMessage = errorMessage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
