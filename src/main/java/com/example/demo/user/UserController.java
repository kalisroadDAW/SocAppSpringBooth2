package com.example.demo.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users")
	public Iterable<Userr> getAllusers(@RequestHeader HttpHeaders header,@RequestParam(defaultValue = "0") Integer page ,@RequestParam(defaultValue = "20000") Integer size
            ){
		return userService.findAll(header,PageRequest.of(page, size));
	}
	
	@RequestMapping(value="/users/{id}", method = RequestMethod.GET)
	public Optional<Userr> getUser(@PathVariable String id){
		return userService.getUser(id);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public void addUser(@RequestBody Userr user) {
		userService.addUser(user);
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
	public void updateUser(@PathVariable String id, @RequestBody Userr user){
		 userService.updateUser(id,user);
	}
	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable String id){
		 userService.deleteUser(id);
	}
	
	//Get users by location id
	@RequestMapping(value="/users/location/{id}", method = RequestMethod.GET)
	public List<Userr> getUsersByLocationId(@PathVariable String id){
		return userService.getUsersByLocationId(id);
	}
	
	@RequestMapping(value="/users/firstname/{firstname}", method = RequestMethod.GET)
	public List<Userr> getUsersByFirstname(@PathVariable String firstname){
		return userService.getUsersByFirstname(firstname);
	}
	
	
	
	  
	
}
