package com.ticket.booking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ticketService {

	@Autowired
	ticketRepo tRepo;
	
	public List<ticket> geTickets(){
		List<ticket> tkList=tRepo.findAll();
		return tkList;
	}
	
	public void saveTicket(ticket Ticket) {
		tRepo.save(Ticket);
	}
	
	public Optional<ticket> finfById(int ticket_number) {
		return tRepo.findById(ticket_number);
	}
}
