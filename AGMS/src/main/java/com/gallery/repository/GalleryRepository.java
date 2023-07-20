package com.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gallery.entity.Gallery;

public interface GalleryRepository<Gal> extends JpaRepository<Gal, Integer> {

	void save(Gallery gallery);

}
