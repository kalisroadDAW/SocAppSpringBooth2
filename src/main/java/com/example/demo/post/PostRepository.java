package com.example.demo.post;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, String>{
	
	   List<Post> findAll(Pageable page);
	
	
	   public List<Post> findByUserId(String userId);
	   
	   



}
