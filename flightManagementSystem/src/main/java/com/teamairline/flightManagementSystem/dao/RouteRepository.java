package com.teamairline.flightManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.teamairline.flightManagementSystem.bean.Route;

public interface RouteRepository extends JpaRepository<Route, Long>
{
    @Query("select max(routeId) from Route")
    Long findLastRouteId();

    @Query("SELECT routeId FROM Route r WHERE r.sourceAirportCode = ?1 AND r.destinationAirportCode = ?2")
    Long findRouteBySourceAndDestination(String sourceAirportCode, String destinationAirportCode);
}
