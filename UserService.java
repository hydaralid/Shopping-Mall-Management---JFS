package com.atria.angularproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User registerUser(User user) {
		System.out.print(user);
		return repository.save(user);
		}

	public List<User> getUsers() {
		return repository.findAll();
	}

	public void deleteUser(Integer id) {
		repository.deleteById(id);
			
	}

	public User updateUser(User user) {
		Integer id = user.getId();
		User U = repository.findById(id).get();
		U.setUsername(user.getUsername());
		U.setEmail(user.getEmail());
		U.setPassword(user.getPassword());
		return repository.save(U);}


}
