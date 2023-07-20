package com.agms.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ResourceNotFoundExceptio extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Object fieldValue;	
	
	public ResourceNotFoundExceptio(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s: '%s'",resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}