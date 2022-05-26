package com.example.demo.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;	
	
	public List<Userr> getAllUsers() {
		List<Userr> users = new ArrayList<>();
		
		userRepository.findAll()
		.forEach(users::add);
		
		return users;
	}
		
	public Optional<Userr> getUser(String id) {
		return userRepository.findById(id);
	}

	public void addUser(Userr user) {
		userRepository.save(user);
	}

	public void updateUser(String id, Userr user) {
		userRepository.save(user);
	}
	
	public void deleteUser(String id) {
	     userRepository.deleteById(id);	
	}
	public List<Userr> getUsersByLocation(String id) {
	    List<Userr> users = new ArrayList<>();
		
	    userRepository.findByLocationId(id)
	    .forEach(users::add);
		
	    return users;
	}
}

