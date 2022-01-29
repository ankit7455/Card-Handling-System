package com.infy.Card.Exceptions;

import javax.persistence.Entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.infy.Card.Controller.CustomerBasicDetailscontroller;
import com.infy.Card.DTO.ErrorMessage;

@RestControllerAdvice
public class ExceptionControllerAdvise {
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception ex) 
	{
		return ex.getMessage();
	}
	@ExceptionHandler(NotValidDetailsException.class)
	public ResponseEntity<ErrorMessage> exceptionhandler2(NotValidDetailsException e1)
	{
		ErrorMessage msgErrorMessage = new ErrorMessage();
		msgErrorMessage.setErrorCode(HttpStatus.BAD_REQUEST.value());
		msgErrorMessage.setMessage(e1.getMessage());
		return new ResponseEntity<>(msgErrorMessage,HttpStatus.OK);
	}
	
}
