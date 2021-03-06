package com.ticket.booking;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_table")
public class ticket {
	@Id
	private int ticket_number;
	private String movie_name;
	private String date;
	
	public ticket() {
	
	}

	public ticket(int ticket_number, String movie_name, String date) {
		super();
		this.ticket_number = ticket_number;
		this.movie_name = movie_name;
		this.date = date;
	}

	public int getTicket_number() {
		return ticket_number;
	}

	public void setTicket_number(int ticket_number) {
		this.ticket_number = ticket_number;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ticket [ticket_number=" + ticket_number + ", movie_name=" + movie_name + ", date=" + date + "]";
	}
	
	
	

}
