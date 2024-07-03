package com.teamairline.flightManagementSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.teamairline.flightManagementSystem.bean.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	
	
	  @Query("select f from Flight f where f.routeId = :routeId")
	    List<Flight> findFlightByRouteId(@Param("routeId") long routeId);

	

}
