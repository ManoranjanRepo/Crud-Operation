package com.vk.locationweb.service;

import java.util.List;

import com.vk.locationweb.entities.Location;

public interface LocationService {
	Location saveLocation(Location location);

	Location updatelocation(Location location);

	void deletelocatin(Location location);

	Location getLocationById(int id);

	List<Location> getAllLocations();
}
