package com.example.demo.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;	
	
	public Iterable<Userr> findAll(HttpHeaders header, Pageable page) {
		return userRepository.findAll(page);
		
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
	public List<Userr> getUsersByLocationId(String id) {
	    List<Userr> users = new ArrayList<>();
		
	    userRepository.findByLocationId(id)
	    .forEach(users::add);
		
	    return users;
	}

	public List<Userr> getUsersByFirstname(String firstname) {
	
		
	    return userRepository.findByFirstname(firstname);
	    
		
	   
		
	}

	
}

