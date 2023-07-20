package com.gallery.model;

import java.time.LocalDate;

import javax.persistence.ManyToOne;
import com.gallery.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GalleryDTO {
	
	private int GalleryId;
	
	private String venue;
	
	private LocalDate date;
	
	private String artname;
	
	private String artType;
	
	private String artist;
		
	@ManyToOne
	User user;


}
