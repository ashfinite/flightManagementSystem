package com.teamairline.flightManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teamairline.flightManagementSystem.bean.Ticket;

public interface TicketRepository extends JpaRepository<Ticket ,Long>{
	@Query("select max(ticketNumber) from Ticket")
	public Long findLastTicketNumber();
}