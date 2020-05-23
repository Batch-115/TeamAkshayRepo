package com.webcore.app.easyemi.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.model.User;
import com.webcore.app.easyemi.master.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "masteruser")
public class UserController {
	@Autowired
	UserService us;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@RequestBody User user)
	{
		us.registerUser(user);
		return "User registration Successfull!!!";
	}
	
	@RequestMapping(value = "/getUserData/{id}", method = RequestMethod.GET)
	public User fetchUserData(@PathVariable("id") int id)
	{
		User user=us.fetchUserData(id);
		return user;
	}

}
