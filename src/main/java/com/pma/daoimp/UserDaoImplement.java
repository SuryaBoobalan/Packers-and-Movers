package com.pma.daoimp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pma.Entity.User;
import com.pma.dao.UserDao;

import jakarta.persistence.EntityManager;

@Repository
public class UserDaoImplement implements UserDao{
	
	
	
	public UserDaoImplement(EntityManager eMan) {
		this.eMan = eMan;
		
	}
	
	EntityManager eMan;

	@Override
	public String addUser(User user) {
		eMan.persist(user);
		return "User Saved";
	}
	
	

	@Override
	public User findUser(int id) {
		
		return eMan.find(User.class, id);
	}

	@Override
	public String updateUser(User user) {
		eMan.persist(user);
		return "Object Saved Successfully";
	}

	@Override
	public String deleteUser(int id) {
		User obj = eMan.find(User.class, id);
		eMan.remove(obj);
		return "User Deleted";
	}

	@Override
	public List<User> getAllUser() {
		return eMan.createQuery("from User").getResultList();
	}



	@Override
	public List<User> lastUser() {
		
		return eMan.createQuery("from User ORDER BY userId DESC LIMIT 1").getResultList();
	}



	@Override
	public List<User> lastUserName() {
		
		return eMan.createQuery("from User ORDER BY userId DESC LIMIT 1").getResultList();
	}
	
	
	
}
