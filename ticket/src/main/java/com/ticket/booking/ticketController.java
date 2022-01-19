package com.ticket.booking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ticketController {
	
	@Autowired
	ticketService tService;
	
	@GetMapping("/get")
	public List<ticket> geTickets(){
		List<ticket> tkList=tService.geTickets();
		return tkList;
	}
	
	@PostMapping("/add")
	public int saveTicket(@RequestBody ticket Ticket) {
		tService.saveTicket(Ticket);
		return 1;
	}
	
	@PutMapping("/{id}")
	public Optional<ticket> findById(@PathVariable("id") int ticket_number) {
		return tService.finfById(ticket_number);
	}

}
