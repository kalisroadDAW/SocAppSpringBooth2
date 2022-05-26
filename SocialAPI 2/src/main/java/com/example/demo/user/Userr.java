package com.example.demo.user;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import com.example.demo.location.Location;


 @Entity
 public class Userr {
	
	@Id
	public String id;
	
    public String firstname;

    public String lastname;
    
    @ManyToOne
    
    public Location location;
    
    
    public String email;
    
    
   
    
		

	public Userr(String id, String firstname, String lastname, Location location, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    

}
