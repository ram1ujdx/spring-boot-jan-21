package com.example.springboot.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.springboot.dto.ErrorResponse;
import com.example.springboot.exception.EmployeeAlreadyExistsException;
import com.example.springboot.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class EmployeeErrorController {

	@ResponseStatus(code = HttpStatus.NOT_FOUND )
	@ExceptionHandler(value = {EmployeeNotFoundException.class})
	public ErrorResponse handleNotFoundError(Exception ex, HttpServletRequest request) {
		return new ErrorResponse(new Date(), HttpStatus.NOT_FOUND.value(), ex.getClass().getSimpleName(), ex.getMessage(), request.getRequestURI());
	}
	
	@ResponseStatus(code = HttpStatus.CONFLICT )
	@ExceptionHandler(value = {EmployeeAlreadyExistsException.class})
	public ErrorResponse handleAlreadyExistsError(Exception ex, HttpServletRequest request) {
		return new ErrorResponse(new Date(), HttpStatus.CONFLICT.value(), ex.getClass().getSimpleName(), ex.getMessage(), request.getRequestURI());
	}
	
	
}
