package com.Beans;

import javax.persistence.Entity;

@Entity
public class ForgotPassBean {

	String email,message;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
