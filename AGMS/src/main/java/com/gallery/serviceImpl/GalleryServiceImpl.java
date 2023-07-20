package com.gallery.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallery.entity.Gallery;
import com.gallery.model.GalleryDTO;
import com.gallery.repository.GalleryRepository;
import com.gallery.service.GalleryService;
import com.gallery.util.GalleryConverter;

@Service

public abstract class GalleryServiceImpl implements GalleryService{
	
	@Autowired
	GalleryRepository galRepository;
	
	@Autowired
	GalleryConverter galConverter;
	
	@Override
	public GalleryDTO saveGallery(Gallery gal) {
		galRepository.save(gal);
		return galConverter.convertGalleryToDTO(gal);
	}
	
}
