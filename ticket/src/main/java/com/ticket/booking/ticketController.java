package com.ticket.booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ticketController {
	
	@Autowired
	ticketService tService;
	
	@GetMapping("/getAllTickets")
	public List<ticket> geTickets(){
		List<ticket> tkList=tService.geTickets();
		return tkList;
	}

}
