package com.justcodeit.cruddatabase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.justcodeit.cruddatabase.pojo.User;
import com.justcodeit.cruddatabase.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/jpa/h2/get-all-users")
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userService.getAllUsers();
	}

	@GetMapping("/jpa/h2/get-user-by-id/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return userService.getUserById(id);
	}

	@PutMapping("/jpa/h2/update-user/{id}")
	public User updateUser(@RequestBody User usr, @PathVariable Integer id) {
		// TODO Auto-generated method stub
		return userService.updateUser(usr, id);
	}

	@PostMapping("/jpa/h2/create-user")
	public User createUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return userService.createUser(user);
	}

	@DeleteMapping("/jpa/h2/delet-user/{id}")
	public void deleteUser(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		userService.deleteUser(id);
	}
}
