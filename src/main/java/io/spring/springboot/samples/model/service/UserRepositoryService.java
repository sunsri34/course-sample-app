package io.spring.springboot.samples.model.service;



import org.springframework.data.repository.CrudRepository;

import io.spring.springboot.samples.model.User;

public interface UserRepositoryService extends CrudRepository<User,String> {
	
	//public List<User> getUsers()
	//public User getUser(String accountNo)
	//public void createUser(User user)
	//public void updateUser(String accountNo, User user)
	//public void deleteUser(String accountNo)

}
