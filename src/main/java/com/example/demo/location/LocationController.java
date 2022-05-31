package com.example.demo.location;

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
public class LocationController {
	
	
	@Autowired  
	public LocationService locationService;
	
	@RequestMapping(value="/locations")//GET
	public Iterable<Location>getAllLocations(@RequestHeader HttpHeaders header,@RequestParam(defaultValue = "0") Integer page ,@RequestParam(defaultValue = "20000") Integer size){
		return locationService.findAll(header,PageRequest.of(page, size));
		
	}
	
	@RequestMapping(value="/locations/{id}") //GET
	public Optional<Location> getLocation(@PathVariable String id){
		return locationService.getLocation(id);
		
	}
	
	@RequestMapping(value="/locations", method=RequestMethod.POST)
	public void addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
		
	}
	
	@RequestMapping(value="/locations/{id}", method=RequestMethod.PUT)
	public void addLocation(@PathVariable String id, @RequestBody Location location) {
		locationService.updateLocation(id,location);
		
	}
	
	@RequestMapping(value="/locations/{id}", method=RequestMethod.DELETE)
	public void deleteLocation(@PathVariable String id) {
		locationService.deleteLocation(id);
		
	}
	
	@RequestMapping(value = "/locations/name/{name}")
	 public List<Location> getLocationByName(@PathVariable String name) {
	 	return locationService.getLocationsByName(name);
	 }
	

}
