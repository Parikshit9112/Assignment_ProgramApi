package com.programs.exception;

import org.springframework.stereotype.Repository;

@Repository
public class ResourceNotFoundException extends RuntimeException {
	
	
//	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
        super(message);
    }
	
	public ResourceNotFoundException(){
        super("Resource Not Found");
    }
}