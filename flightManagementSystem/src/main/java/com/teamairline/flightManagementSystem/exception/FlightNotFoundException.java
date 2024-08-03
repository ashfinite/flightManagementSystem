package com.teamairline.flightManagementSystem.exception;


public class FlightNotFoundException extends RuntimeException {
    public FlightNotFoundException(String message) {
        super(message);
    }
}