package com.teamairline.flightManagementSystem.dao;

import com.teamairline.flightManagementSystem.bean.Airport;

import java.util.List;

public interface AirportDao {
	void addAirport(Airport airport);
    List<Airport> findAllAirports();
    Airport findAirportById(String id);
    List<String> findAllAirportCodes();
    List<String> findAllAirportLocations();
    
    String findAirportCodeByLocation(String location);
    void updateAirport(Airport airport);
    void deleteAirport(String id);
    long countAirports();

}
