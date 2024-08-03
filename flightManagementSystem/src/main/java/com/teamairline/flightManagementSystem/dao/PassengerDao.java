package com.teamairline.flightManagementSystem.dao;

import java.util.List;
import java.util.Optional;

import com.teamairline.flightManagementSystem.bean.Passenger;
import com.teamairline.flightManagementSystem.bean.TicketPassengerEmbed;

public interface PassengerDao {
    void save(Passenger passenger);
    Optional<Passenger> findById(TicketPassengerEmbed id);
    List<Passenger> findAll();
    void deleteByTicketNumber(Long ticketNumber);
    List<Passenger> findByTicketNumber(Long ticketNumber);

}