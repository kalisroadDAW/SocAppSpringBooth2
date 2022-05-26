package com.example.demo.post;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.user.Userr;

@Entity
public class Post {
	
	   @Id
	   private String id;
	   private String postdate;
	   
	   @ManyToOne
	   private Userr user;
	   private String details;
	   
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public Userr getUser() {
		return user;
	}
	public void setUser(Userr user) {
		this.user = user;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Post(String id, String postdate, Userr user, String details) {
		super();
		this.id = id;
		this.postdate = postdate;
		this.user = user;
		this.details = details;
	}
	   
	   

}
