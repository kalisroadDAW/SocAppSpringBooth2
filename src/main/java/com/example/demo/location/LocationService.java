package com.example.demo.location;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	 
	@Autowired
	public LocationRepository locationRepository;
	
	public List<Location> findAll(HttpHeaders header, Pageable page){
		return locationRepository.findAll(page);
		
	}
		
	public void addLocation(Location location) {
		locationRepository.save(location);
	}
		
	public Optional<Location> getLocation(String id) {
		return locationRepository.findById(id);
	}
	
	public void deleteLocation(String id) {
		locationRepository.deleteById(id);
	}
	
	public void updateLocation(String id, Location location) {
	     locationRepository.save(location);
	}
	
	public List<Location> getLocationsByName(String name) {
	    List<Location> locations  = new ArrayList<>();
		   
	    locationRepository.findByName(name)
	    .forEach(locations::add);
		   
	    return locations;
	}
			
			
		}


