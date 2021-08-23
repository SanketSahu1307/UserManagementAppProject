package com.careerinfotech.usermanagement.dto;

public class UserSignIn {
	
	private String email;
	private String password;
	
	public UserSignIn() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserSignIn(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserSignIn [email=" + email + ", password=" + password + "]";
	}
	
	

}
