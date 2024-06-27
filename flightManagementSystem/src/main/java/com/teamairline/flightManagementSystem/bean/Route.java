package com.teamairline.flightManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routeId;

    private String sourceAirportCode;
    private String destinationAirportCode;

    // Default constructor
    public Route() {
    }

    // Parameterized constructor
    public Route(Long routeId, String sourceAirportCode, String destinationAirportCode) {
        this.routeId = routeId;
        this.sourceAirportCode = sourceAirportCode;
        this.destinationAirportCode = destinationAirportCode;
    }

    // Getters and setters
    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getSourceAirportCode() {
        return sourceAirportCode;
    }

    public void setSourceAirportCode(String sourceAirportCode) {
        this.sourceAirportCode = sourceAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    @Override
    public String toString() {
        return "Route [routeId=" + routeId + ", sourceAirportCode=" + sourceAirportCode + ", destinationAirportCode=" + destinationAirportCode + "]";
    }

    // Method to create a reverse route
    public Route createReverseRoute() {
        return new Route(null, this.destinationAirportCode, this.sourceAirportCode);
    }
}
