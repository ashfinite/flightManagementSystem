package com.teamairline.flightManagementSystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.teamairline.flightManagementSystem.bean.Route;
//import com.teamairline.flightManagementSystem.dao.AirportDao;
import com.teamairline.flightManagementSystem.dao.AirportRepository;
import com.teamairline.flightManagementSystem.dao.RouteDao;
import com.teamairline.flightManagementSystem.dao.RouteRepository;
import com.teamairline.flightManagementSystem.service.RouteService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RouteController {

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private RouteService routeService;

    @Autowired
    private AirportRepository airportRepository;

    @GetMapping("/route")
    public ModelAndView showAddRouteForm() {
        Long newRouteId = routeService.generateRouteId();
        Route route = new Route();
        route.setRouteId(newRouteId);
        ModelAndView mv = new ModelAndView("routeEntryPage");
        mv.addObject("routeRecord", route);
        return mv;
    }

    @PostMapping("/route")
    public ModelAndView saveRoute(@ModelAttribute("routeRecord") Route route) {
        String sourceLocation = route.getSourceAirportCode();
        String destinationLocation = route.getDestinationAirportCode();
        String sourceCode = airportRepository.findAirportCodeByLocation(sourceLocation);
        String destinationCode = airportRepository.findAirportCodeByLocation(destinationLocation);
        route.setSourceAirportCode(sourceCode);
        route.setDestinationAirportCode(destinationCode);
        routeRepository.save(route);
        Route reverseRoute = routeService.createReturnRoute(route);
        routeRepository.save(reverseRoute);
        return new ModelAndView("redirect:/showAllRoutes");
    }

    @GetMapping("/showAllRoutes")
    public ModelAndView showAllRoutes() {
        ModelAndView mv = new ModelAndView("routeReportPage");
        mv.addObject("list", routeRepository.findAll());
        return mv;
    }
}
    
	

