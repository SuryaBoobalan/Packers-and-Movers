package com.pma.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pma.Entity.User;
import com.pma.dao.UserDao;
import com.pma.service.UserService;



@Service
@Transactional
public class UserServiceImplement implements UserService {

	
	UserDao udao;
	
	
	
	public UserServiceImplement(UserDao udao) {
		super();
		this.udao = udao;
	}

	@Override
	public String addUser(User user) {
		
		return udao.addUser(user);
	}

	@Override
	public User findUser(int id) {
		
		return udao.findUser(id);
	}

	@Override
	public String updateUser(User user) {
		
		return udao.updateUser(user);
	}

	@Override
	public String deleteUser(int id) {
		
		return udao.deleteUser(id);
	}

	@Override
	public List<User> getAllUser() {
		return udao.getAllUser();
	}
	
	@Override
	public List<User> lastUser() {
		
		return udao.lastUser();
	}

	@Override
	public List<User> lastUserName() {
		
		return udao.lastUserName();
	}

}
