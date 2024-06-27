package com.teamairline.flightManagementSystem.dao;
import com.teamairline.flightManagementSystem.bean.Route;
import java.util.List;

public interface RouteDao {
    void save(Route route);
    List<Route> findAllRoutes();
    Route findRouteById(Long id);
    Long findRouteBySourceAndDestination(String source, String destination);
    Long generateRouteId();
}
