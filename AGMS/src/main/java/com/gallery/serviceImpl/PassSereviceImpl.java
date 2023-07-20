package com.gallery.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ems.exceptions.ResourceNotFoundException;
import com.gallery.entity.Gallery;
import com.gallery.entity.Pass;
import com.gallery.model.PassDTO;
import com.gallery.repository.AdminRepository;
import com.gallery.repository.GalleryRepository;
import com.gallery.repository.PassRepository;
import com.gallery.service.PassService;
import com.gallery.util.PassConverter;

public class PassSereviceImpl implements PassService{
	

	@Autowired
	PassRepository passRepository;

	@Autowired
	PassConverter converter;
	
	@Autowired
	GalleryRepository galleryRepo;
	
	@SuppressWarnings("rawtypes")
	@Autowired
	AdminRepository adminRepository;

	public PassDTO createPass1(int galleryId,int adminId, Pass pass){
		Gallery gallery= new Gallery();
		pass.setAmount(getgalleryPrize());
		pass.setPass_status("Pass Placed");
		pass.setPrice(galleryId);
		passRepository.save(pass); 
		
		return converter.convertToPassDTO();
	}

	private Object getgalleryPrize() {
		return null;
	}

	@Override
	public PassDTO createPass(int GalleryId, int GalleryId1, Pass pass) {
		return null;
	}

	@Override
	public PassDTO getPassById(int id) {
		return null;
	}

	@Override
	public PassDTO getpassById(int id, Pass pass) {
		return null;
	}


	


}
