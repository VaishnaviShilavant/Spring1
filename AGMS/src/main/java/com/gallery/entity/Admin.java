package com.gallery.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Admin extends User{
	@Id
	@Column(length=20, nullable = false)
	private String name;
	
	@Column(length=10,nullable = false)
	private double contact;


}
