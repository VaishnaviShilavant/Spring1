package com.gallery.repository;


import com.gallery.entity.Pass;
import com.gallery.model.PassDTO;

public interface PassRepository {

	void save(Pass pass);

	PassDTO convertToPassDTO();

}
