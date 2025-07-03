package com.nt.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ActorAPIRestControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	public  ResponseEntity<String>  handleAllException(Exception e){
		return  new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ActorNotFoundException.class)
	public  ResponseEntity<String>  handleANFException(ActorNotFoundException anfe){
		return  new ResponseEntity<String>(anfe.getMessage(),HttpStatus.INSUFFICIENT_STORAGE);
	}
	
	

}
