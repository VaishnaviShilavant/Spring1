package com.gallery.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.gallery.entity.Gallery;
import com.gallery.model.GalleryDTO;

@Component
public class GalleryConverter {

	public Gallery convertDTOToGalleryEnt(GalleryDTO gDto)
	{
		Gallery gal = new Gallery();
		
		if(gDto!=null)
		{
			BeanUtils.copyProperties(gDto, gal);
		}
		
		return gal;
	}
	
	
	public GalleryDTO convertGalleryToDTO(Gallery gal)
	{
		GalleryDTO gDto = new GalleryDTO();
		
		if(gal!=null)
		{
			BeanUtils.copyProperties(gal, gDto);
		}
		
		return gDto;
	}


	
}
