package com.example.demo.post;


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
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@RequestMapping(value = "/posts", method=RequestMethod.GET)
	public Iterable<Post>getAllPost(@RequestHeader HttpHeaders header,@RequestParam(defaultValue = "0") Integer page ,@RequestParam(defaultValue = "20000") Integer size){
		return postService.findAll(header, PageRequest.of(page, size));
	}
	
	@RequestMapping(value="/posts/{id}")
	public Optional<Post> getPost(@PathVariable String id){
		return postService.getPost(id);
	}
	
	@RequestMapping(value="/posts", method=RequestMethod.POST)
	public void addPost(@RequestBody Post post){
		 postService.addPost(post);
	}
	
	@RequestMapping(value="/posts/{id}", method = RequestMethod.PUT)
	public void updatePost(@PathVariable String id, @RequestBody Post post) {

	      postService.updatePost(id, post);

	}
	@RequestMapping(value="/posts/{id}", method = RequestMethod.DELETE)
	public void deletePost(@PathVariable String id) {

	      postService.deletePost(id);

	}
	
	
	}


