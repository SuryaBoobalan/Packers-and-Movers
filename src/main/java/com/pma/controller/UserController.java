package com.pma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pma.Entity.User;
import com.pma.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/rest/")
public class UserController {

	private UserService service;
	
	
	
	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping("/User")
	public String addUser(@RequestBody User user)
	
	{
		System.out.println(user);
		return service.addUser(user);
	}
	
	@GetMapping("/User/{userId}")
	public User findUser(@PathVariable("userId") final int userId)
	{
		return service.findUser(userId);
	}
	
	@GetMapping("/UserLast")
	public List<User> lastUser()
	{
		return service.lastUser();
	}
	
	@GetMapping("/UserLastName")
	public List<User> lastUserName()
	{
		return service.lastUserName();
	}
	
	@PutMapping("/User")
	public String updateUser(@RequestBody User user)
	{
		return service.updateUser(user);
	}
	
	@DeleteMapping("/User/{userId}")
	public String deleteUser(@PathVariable("userId") final int userId)
	{
		return service.deleteUser(userId);
	}
	
	
}
