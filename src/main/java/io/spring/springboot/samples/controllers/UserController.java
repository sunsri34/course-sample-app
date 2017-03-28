package io.spring.springboot.samples.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.spring.springboot.samples.model.User;
import io.spring.springboot.samples.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// GET List of all users
	
	
	@RequestMapping("/users")
	public List<User> getUsers(){
		System.out.println("public List<User> getUsers()");
		return userService.getUsers();
	}
	
	// GET single user based on id
	@RequestMapping(value = "/user/{accountNo}",method = RequestMethod.GET)
	public User getUser(@PathVariable String accountNo){
		
		return userService.getUser(accountNo);
	}
	//POST to create new user 
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void createUser(@RequestBody User user){
		userService.createUser(user);
	}
	//PUT to update existing user
	@RequestMapping(value="/user/{accountNo}", method = RequestMethod.PUT)
	public void updateUser(@RequestBody User user,@PathVariable String accountNo){
		userService.updateUser(accountNo, user);
	}
	//DELETE the user based on ID
	@RequestMapping(value= "/user/{accountNo}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable String accountNo){
		userService.deleteUser(accountNo);
	}

}
