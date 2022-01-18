package com.ticket.booking;

import java.util.List;

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
}
