package com.gallery.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gallery.entity.Gallery;
import com.gallery.model.GalleryDTO;
import com.gallery.service.GalleryService;

public class GalleryController {
	
	@Autowired
	GalleryService galleryService;
	
	@Autowired
	GalleryController Converter;

	@PostMapping("/savegallery")
	public GalleryDTO createGallery(@RequestBody Gallery gallery)
	{
		return  galleryService.createGallery(gallery);
	}

}
