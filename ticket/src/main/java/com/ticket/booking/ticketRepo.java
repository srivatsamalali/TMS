package com.ticket.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ticketRepo extends JpaRepository<ticket, Integer> {

}
