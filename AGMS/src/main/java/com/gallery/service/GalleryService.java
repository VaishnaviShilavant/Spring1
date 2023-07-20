package com.gallery.service;

import java.util.List;


import com.gallery.entity.Gallery;
import com.gallery.model.GalleryDTO;

public interface GalleryService {

	GalleryDTO saveGallery(Gallery gal);

	public GalleryDTO createGallery(Gallery gallery); 

	
	public GalleryDTO getGalleryById(int id); 
	
	public List<GalleryDTO>getAllGallery(); 
	
	public GalleryDTO updateGalleryById(int id, Gallery gallery); 
	
	void deletegalleryById(int id); 
	
	void deleteAllGallery(); 

	
	

}
