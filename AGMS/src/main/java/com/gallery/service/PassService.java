package com.gallery.service;

import com.gallery.entity.Pass;
import com.gallery.model.PassDTO;
import com.gallery.serviceImpl.passDTO;

public interface PassService {
	
	public PassDTO createPass(int GalleryId,int GalleryId1,Pass pass); //method to create pass
	 
	 public PassDTO getPassById(int id);

	PassDTO createPass1(int galleryId, int adminId, Pass pass);

	PassDTO getpassById(int id);

	PassDTO getpassById(int id, Pass pass); 


}
