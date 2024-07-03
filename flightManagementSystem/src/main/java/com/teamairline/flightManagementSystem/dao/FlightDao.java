package com.teamairline.flightManagementSystem.dao;

import java.util.List;

import com.teamairline.flightManagementSystem.bean.Flight;

public interface FlightDao 
{
	 void save(Flight flight);
	    List<Flight> findAllFlights();
	    List<Flight> findFlightsByRouteId(Long routeId);
}
