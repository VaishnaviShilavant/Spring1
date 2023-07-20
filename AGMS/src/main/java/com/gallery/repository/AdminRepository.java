package com.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gallery.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
