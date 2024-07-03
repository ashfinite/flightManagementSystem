package com.teamairline.flightManagementSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teamairline.flightManagementSystem.bean.Flight;


@Repository
public class FlightDaoImpl implements FlightDao {


	  @Autowired
	    private FlightRepository flightRepository;

	    @Override
	    public void save(Flight flight) {
	        flightRepository.save(flight);
	    }

	    @Override
	    public List<Flight> findAllFlights() {
	        return flightRepository.findAll();
	    }

	    @Override
	    public List<Flight> findFlightsByRouteId(Long routeId) {
	        return flightRepository.findFlightByRouteId(routeId);
	    }


}
