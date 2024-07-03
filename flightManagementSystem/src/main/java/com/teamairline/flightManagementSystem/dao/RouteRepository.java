package com.teamairline.flightManagementSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teamairline.flightManagementSystem.bean.Route;

public interface RouteRepository extends JpaRepository<Route, Long>
{
	  @Query("select max(routeId) from Route")
	    Long findLastRouteId();

	    @Query("SELECT a FROM Route a WHERE sourceAirportCode = ?1 AND destinationAirportCode = ?2")
	    Route findRouteBySourceAndDestination(String sourceAirportCode, String destinationAirportCode);

	    @Query("SELECT routeId FROM Route")
	    List<Long> findAllRoutesId();


}

