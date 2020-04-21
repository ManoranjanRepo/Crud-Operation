package com.vk.locationweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.locationweb.entities.Location;
import com.vk.locationweb.repos.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository repos;

	@Override
	public Location saveLocation(Location location) {
		
		return repos.save(location);
	}

	@Override
	public Location updatelocation(Location location) {
		
		return repos.save(location);
	}

	@Override
	public void deletelocatin(Location location) {
		repos.delete(location);
		
	}

	@Override
	public Location getLocationById(int id) {
		return repos.findById(id).get();
	}

	@Override
	public List<Location> getAllLocations() {
		return repos.findAll();
	}

	public LocationRepository getRepos() {
		return repos;
	}

	public void setRepos(LocationRepository repos) {
		this.repos = repos;
	}

}
