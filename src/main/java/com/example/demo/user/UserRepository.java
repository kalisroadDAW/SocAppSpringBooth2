package com.example.demo.user;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<Userr, String> {
	
	   
       List<Userr> findAll(Pageable page);
	
	   public List<Userr> findByLocationId(String locationId);
	   
	   public List<Userr>findByFirstname(String firstname);



}
