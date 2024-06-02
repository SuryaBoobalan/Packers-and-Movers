package com.pma.service;

import java.util.List;

import com.pma.Entity.User;

public interface UserService {

	public String addUser(User user);
	
	public User findUser(int userId);
	
	public String updateUser(User user);
	
	public String deleteUser(int id);
	
	public List<User> getAllUser();
	
	public List<User> lastUser();
	
	public List<User> lastUserName();

}
