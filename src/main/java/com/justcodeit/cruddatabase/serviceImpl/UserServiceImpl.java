package com.justcodeit.cruddatabase.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.justcodeit.cruddatabase.pojo.User;
import com.justcodeit.cruddatabase.repository.UserRepository;
import com.justcodeit.cruddatabase.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public User updateUser(User usr, Integer id) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findById(id);
		User updateUser = user.get();
		updateUser.setId(usr.getId());
		updateUser.setName(usr.getName());
		updateUser.setAddress(usr.getAddress());
		updateUser.setDate(usr.getDate());
		updateUser.setPassword(usr.getPassword());
		userRepository.save(updateUser);
		return updateUser;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

}
