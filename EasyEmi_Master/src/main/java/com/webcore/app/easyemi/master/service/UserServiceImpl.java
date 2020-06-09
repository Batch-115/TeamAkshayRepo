package com.webcore.app.easyemi.master.service;

import java.util.List;import javax.jws.soap.SOAPBinding.Use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.master.dto.UserDisplayDto;
import com.webcore.app.easyemi.master.model.User;
import com.webcore.app.easyemi.master.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public void registerUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User fetchUserData(int id) {
		User user=userRepository.findById(id).get();
		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> userList=userRepository.findAll();
		return userList;
	}

	@Override
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public List<UserDisplayDto> getAllUserDto() {
		List<UserDisplayDto> userDtoList=userRepository.getAllUserDto();
		return userDtoList;
	}

}
