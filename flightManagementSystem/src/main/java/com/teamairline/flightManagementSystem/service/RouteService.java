package com.teamairline.flightManagementSystem.service;
import com.teamairline.flightManagementSystem.bean.Route;
import com.teamairline.flightManagementSystem.dao.RouteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;

@Service
public class RouteService
{
    @Autowired
    private RouteRepository routeRepository;

    public Route createReturnRoute(Route route) {
        // Generate a new ID for the return route
        Long newId = (route.getRouteId() != null) ? route.getRouteId() + 1 : 101L;

        // Swap source and destination codes
        String sourceCode = route.getDestinationAirportCode();
        String destinationCode = route.getSourceAirportCode();

        // Create the return route
        return new Route(newId, sourceCode, destinationCode);
    }

    public Long generateRouteId() {
        Long lastRouteId = routeRepository.findLastRouteId();
        if (lastRouteId == null || lastRouteId < 101) {
            return 101L;
        }
        return lastRouteId + 1;
    }
}
