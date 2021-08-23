package com.careerinfotech.usermanagement.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerinfotech.usermanagement.dto.UserSignIn;
import com.careerinfotech.usermanagement.dto.UserSignUp;
import com.careerinfotech.usermanagement.entity.UserProfile;
import com.careerinfotech.usermanagement.repository.UserDao;


@Service
public class UserService {

	@Autowired
	private UserDao repo;
	
	public UserSignUp saveUserData(UserProfile profile) {
		ModelMapper mapper= new ModelMapper();
		UserProfile save = repo.save(profile);
		UserSignUp signUp= mapper.map(save, UserSignUp.class);
		return signUp;
	}
	
	public UserSignIn getAllUserData(UserProfile profile) {
		ModelMapper mapper =new ModelMapper();
		List<UserProfile> findAll = repo.findAll();
		UserSignIn signIn=mapper.map(findAll, UserSignIn.class);
		return signIn;
	}

	public UserSignIn saveUserSignIn(UserProfile profile) {
		ModelMapper mapper= new ModelMapper();
		UserProfile save = repo.save(profile);
		UserSignIn signIn= mapper.map(save, UserSignIn.class);
		return signIn;
	}

}
