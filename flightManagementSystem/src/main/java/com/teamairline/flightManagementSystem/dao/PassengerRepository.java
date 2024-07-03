package com.teamairline.flightManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamairline.flightManagementSystem.bean.Passenger;
import com.teamairline.flightManagementSystem.bean.TicketPassengerEmbed;

public interface PassengerRepository extends JpaRepository<Passenger, TicketPassengerEmbed>
{

}
