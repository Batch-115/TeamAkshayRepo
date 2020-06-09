package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.dto.UserDisplayDto;
import com.webcore.app.easyemi.master.dto.UserDto;
import com.webcore.app.easyemi.master.model.User;
import com.webcore.app.easyemi.master.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "masteruser")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@RequestBody User user)
	{
		userService.registerUser(user);
		return "User registration Successfull!!!";
	}
	
	@RequestMapping(value = "/getUserData/{id}", method = RequestMethod.GET)
	public User fetchUserData(@PathVariable("id") int id)
	{
		System.out.println(id);
		User user=userService.fetchUserData(id);
		return user;
	}
	
	@RequestMapping(value = "/getUserDataDto/{id}", method = RequestMethod.GET)
	public UserDto fetchUserDataDto(@PathVariable("id") int id)
	{
		System.out.println(id);
		User user=userService.fetchUserData(id);
		ModelMapper m = new ModelMapper(); 
		UserDto userDto = m.map(user,  UserDto.class);
		return userDto;
	}
	
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public List<User> getAllUser()
	{
		List<User> userList=userService.getAllUser();
		return userList;
	}
	
	@RequestMapping(value = "/getAllUserDto", method = RequestMethod.GET)
	public List<UserDisplayDto> getAllUserDto()
	{
		List<UserDisplayDto> userDtoList=userService.getAllUserDto();
		return userDtoList;
	}
	
	@RequestMapping(value = "deleteUser/{userId}", method = RequestMethod.DELETE)
	public List<User> deleteUser(@PathVariable("userId") int userId)
	{
		userService.deleteUser(userId);
		List<User> userList=userService.getAllUser();
		return userList;
	}
	
	@RequestMapping(value = "/updateuser", method = RequestMethod.PUT)
	public void updateUser(@RequestBody User user)
	{
		userService.registerUser(user);
	}

}
