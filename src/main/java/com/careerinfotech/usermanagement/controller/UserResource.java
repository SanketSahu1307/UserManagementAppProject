package com.careerinfotech.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.careerinfotech.usermanagement.dto.UserSignIn;
import com.careerinfotech.usermanagement.dto.UserSignUp;
import com.careerinfotech.usermanagement.entity.UserProfile;
import com.careerinfotech.usermanagement.service.UserService;

@RestController
public class UserResource {
	
	@Autowired
	private UserService serv;
	
	@GetMapping("/msg")
	public String msg() {
		return "My name is sanket...";
	}
	
	@PostMapping("/signUp")
	public UserSignUp saveUserSignUp(@RequestBody UserProfile user) {
		UserSignUp saveUserData = serv.saveUserData(user);
		return saveUserData;
	}
	
	@PostMapping("/signIn")
	public UserSignIn saveUserSignIn(@RequestBody UserProfile user) {
		UserSignIn saveUserData = serv.saveUserSignIn(user);
		return saveUserData;
	}
	
	@GetMapping("/getsignIn")
	public UserSignIn getUserSignIn(UserProfile user) {
		UserSignIn allUserData = serv.getAllUserData(user);
		return allUserData;
	}
	
	

}
