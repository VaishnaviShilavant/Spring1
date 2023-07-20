package com.gallery.entity;

import java.time.LocalDate;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Gallery {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int GalleryId;
	
	@Column(name="city",  nullable = false)
	private String venue;
	
	@Column(name="date",  nullable = false)
	private LocalDate date;
	
	@Column(name="artName")
	private String artname;
	
	@Column(name="artType")
	private String artType;
	
	@Column(name="artist")
	private String artist;
	
	//@Column(nullable = false)
	//private double pass;
	
	@ManyToOne
	User user;

	
}
