package com.teamairline.flightManagementSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teamairline.flightManagementSystem.bean.Flight;





@Repository
public class FlightDaoImpl implements FlightDao {

    @Autowired
    private FlightRepository repository;

    @Override
    public void save(Flight flight) {
    	repository.save(flight);
    }

    @Override
    public List<Flight> findAllFlights() {
        return repository.findAll();
    }

    @Override
    public Flight findFlightById(Long id) {
        return repository.findById(id).get();
    }
    @Override
    public List<Flight> findFlightsByRouteId(Long routeId) {
        return repository.findFlightByRouteId(routeId);
    }

    @Override
    public void deleteById(Long flightNumber) {
    	repository.deleteById(flightNumber);
    }
    @Override
    public long countFlights() {
        return repository.count();
    }
   

   
}