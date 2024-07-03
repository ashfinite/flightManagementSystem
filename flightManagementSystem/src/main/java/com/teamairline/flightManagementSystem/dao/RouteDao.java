package com.teamairline.flightManagementSystem.dao;
import com.teamairline.flightManagementSystem.bean.Route;
import java.util.List;

public interface RouteDao {
	public void save(Route route);
	public List<Route> findAllRoutes();
	public Route findRouteById(Long id);
	public  Route findRouteBySourceAndDestination(String source, String destination);
	public Long generateRouteId(); // Add this line
	public List<Long> findAllRoutesId();


}
