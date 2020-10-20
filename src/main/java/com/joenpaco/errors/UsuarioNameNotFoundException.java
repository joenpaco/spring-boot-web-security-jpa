package com.joenpaco.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNameNotFoundException extends RuntimeException {

	public UsuarioNameNotFoundException(String message) {
		super(message);
	}
	
	

}
