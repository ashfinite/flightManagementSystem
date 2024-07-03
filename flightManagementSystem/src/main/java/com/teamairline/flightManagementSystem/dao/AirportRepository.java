package com.teamairline.flightManagementSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teamairline.flightManagementSystem.bean.Airport;

public interface AirportRepository extends JpaRepository<Airport, String> 
{


    @Query("SELECT a.airportCode FROM Airport a WHERE a.airportLocation = ?1")
    String findAirportCodeByLocation(String location);

    @Query("SELECT a.airportCode FROM Airport a")
    List<String> findAllAirportCodes();
    
    @Query("SELECT a.airportLocation FROM Airport a") // Query to fetch all airport locations
    List<String> findAllAirportLocations();
    
}

