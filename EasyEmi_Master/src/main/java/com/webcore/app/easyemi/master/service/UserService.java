package com.webcore.app.easyemi.master.service;

import java.util.List;

import com.webcore.app.easyemi.master.dto.UserDisplayDto;
import com.webcore.app.easyemi.master.model.User;

public interface UserService {

	void registerUser(User user);

	User fetchUserData(int id);

	List<User> getAllUser();

	void deleteUser(int userId);

	List<UserDisplayDto> getAllUserDto();

}
