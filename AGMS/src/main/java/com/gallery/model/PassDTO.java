package com.gallery.model;

import java.time.LocalDate;

public class PassDTO {
	
    private double price;
	
	private LocalDate date;
	
	private double people;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getPeople() {
		return people;
	}

	public void setPeople(double people) {
		this.people = people;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
