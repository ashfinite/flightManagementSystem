
package com.teamairline.flightManagementSystem.dao;

import com.teamairline.flightManagementSystem.bean.Ticket;


public interface TicketDao {
    void save(Ticket ticket);
    Long findLastTicketNumber();
}