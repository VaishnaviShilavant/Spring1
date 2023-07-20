package com.gallery.entity;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Pass {
	
	private int id ;
	
	@Column(length=20, nullable = false)
	private double price;
	
	@Column(length=20, nullable = false)
	private double people;
	
	@Column(length=20, nullable = false)
	private LocalDate date;

	public void setPass_status(String string) {
		
	}

	public void setAmount(Object getgalleryPrize) {
		
	}

}
