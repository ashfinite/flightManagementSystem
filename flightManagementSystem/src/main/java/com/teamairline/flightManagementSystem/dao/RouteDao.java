package com.teamairline.flightManagementSystem.dao;
import java.util.List;

import com.teamairline.flightManagementSystem.bean.Route;


public interface RouteDao {
    void save(Route route);
    List<Route> findAllRoutes();
    Route findRouteById(Long id);
    Route findRouteBySourceAndDestination(String source, String destination);
    Long generateRouteId();
    List<Long> findAllRoutesId();
    void delete(Long routeId); // Add this method
    long countRoutes(); 
}