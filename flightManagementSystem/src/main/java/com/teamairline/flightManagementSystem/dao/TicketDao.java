package com.teamairline.flightManagementSystem.dao;


import java.util.List;
import java.util.Optional;

import com.teamairline.flightManagementSystem.bean.Ticket;

public interface TicketDao {
    void save(Ticket ticket);
    Long findLastTicketNumber();
    void deleteById(Long ticketNumber);
    List<Ticket> findAllTicketsByUsername(String username);
    List<Ticket> findAllTickets();
    Optional<Ticket> findById(Long ticketNumber);
    Ticket findByTicketNumber(Long ticketNumber); 
    long countTickets(); 
    List<Ticket> findTicketsByUsername(String username);
}