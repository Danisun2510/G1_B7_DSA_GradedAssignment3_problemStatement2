package com.ticket.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.tracker.entity.Tickets;

public interface TicketRepository extends JpaRepository<Tickets, Long> {
	
	

}
