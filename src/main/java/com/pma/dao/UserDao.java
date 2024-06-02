package com.pma.dao;

import java.util.List;

import com.pma.Entity.User;

public interface UserDao {

	public String addUser(User user);
	
	public User findUser(int id);
	
	public String updateUser(User user);
	
	public String deleteUser(int id);
	
	public List<User> getAllUser();
	
	public List<User> lastUser();
	
	public List<User> lastUserName();
}
