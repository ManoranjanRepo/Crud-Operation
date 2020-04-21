package com.vk.locationweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.vk.locationweb.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
