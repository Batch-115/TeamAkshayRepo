package com.webcore.app.easyemi.master.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.master.model.User;
import com.webcore.app.easyemi.master.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository ur;

	@Override
	public void registerUser(User user) {
		ur.save(user);
	}

	@Override
	public User fetchUserData(int id) {
		User user=ur.findById(id).get();
		return user;
	}

}
