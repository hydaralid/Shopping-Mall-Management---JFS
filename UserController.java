package com.atria.angularproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowedHeaders = "*" , origins = "*")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/registerUser")
	public User registerUser(@RequestBody User user) {
		return service.registerUser(user);}
	
	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return service.getUsers();}

	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestParam Integer id) {
		service.deleteUser(id);	} 
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
}
