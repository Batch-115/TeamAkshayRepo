package com.webcore.app.easyemi.master.service;

import com.webcore.app.easyemi.master.model.User;

public interface UserService {

	void registerUser(User user);

	User fetchUserData(int id);

}
