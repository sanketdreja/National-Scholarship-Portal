package com.nsp.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MinistryNotFoundException extends RuntimeException {
private static final long serialVersionUID = 1L;
	
	public MinistryNotFoundException(String message) {
		super(message);
	}

}