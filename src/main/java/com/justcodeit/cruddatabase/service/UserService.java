package com.justcodeit.cruddatabase.service;

import java.util.List;
import java.util.Optional;
import com.justcodeit.cruddatabase.pojo.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public Optional<User> getUserById(Integer id);
	
	public User updateUser(User usr, Integer id);
	
	public User createUser(User user);
	
	public void deleteUser(Integer id);	
}
