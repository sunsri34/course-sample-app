package io.spring.springboot.samples.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.springboot.samples.model.*;
import io.spring.springboot.samples.model.service.UserRepositoryService;

@Service
public class UserService {
	private List<User> users= new ArrayList<>(Arrays.asList(new User("007501515904","Ravi","9912924153","ravi.vanama09@gmail.com"),
			new User("007501515905","Ravikumar","9912924153","ravi.vanama09@gmail.com"),	
			new User("007501515906","vanamaRavikumar","9912924153","ravi.vanama09@gmail.com")));
	
	@Autowired
	private UserRepositoryService userRepoService;
	
	public List<User> getUsers(){
		//return users;
		System.out.println("@ UserService-UserRepository-getUsers.:):):)");
		List<User> users = new ArrayList<>();
		userRepoService.findAll().forEach(users::add);
		return users;
	}
	
	public User getUser(String accountNo){
		return users.stream().filter(u -> u.getAccountNo().equals(accountNo)).findFirst().get();
		//userRepoService.findOne()
	}
	
	public void createUser(User user){
		System.out.println("@ UserService-UserRepository-createUser...");
		userRepoService.save(user);
	}
	
	public void updateUser(String accountNo, User user){
		for(int i=0; i<users.size();i++){
			User us = users.get(i);
			if(us.getAccountNo().equals(accountNo)){
				users.add(user);
				return;
			}
		}
	}
	
	public void deleteUser(String accountNo) {
		users.removeIf(u -> u.getAccountNo().equals(accountNo));
		
	}

}
