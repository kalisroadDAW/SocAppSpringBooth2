package com.example.demo.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Userr, String> {
	
	   public List<Userr> findByLocationId(String locationId);



}
