package com.teamairline.flightManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamairline.flightManagementSystem.bean.Flight;
import com.teamairline.flightManagementSystem.bean.Route;
import com.teamairline.flightManagementSystem.dao.RouteDao;

@Service
public class FlightService {
	   @Autowired
	    private RouteDao routeDao;

	    public Flight createReturnFlight(Flight flight, String dtime, String atime) {
	        Long newId = flight.getFlightNumber() + 1;
	        Route route = routeDao.findRouteById(flight.getRouteId());
	        String sourceCode = route.getDestinationAirportCode();
	        String destinationCode = route.getSourceAirportCode();
	        Route returnRoute = routeDao.findRouteBySourceAndDestination(sourceCode, destinationCode);
	        return new Flight(newId, flight.getCarrierName(), returnRoute.getRouteId(), flight.getSeatCapacity(), dtime, atime);
	    }

}
