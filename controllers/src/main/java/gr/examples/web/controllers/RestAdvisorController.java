package gr.examples.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ValidationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import gr.examples.transport.dto.ErrorDto;
import gr.examples.transport.enumeration.RestError;

@RestControllerAdvice
public class RestAdvisorController {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDto> exceptionHandle(Exception e, HttpServletRequest request) {
		return new ResponseEntity(new ErrorDto(e.getMessage()), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({MethodArgumentNotValidException.class, ValidationException.class})
	public ResponseEntity<ErrorDto> validationExceptionHandle(MethodArgumentNotValidException e) {
		return new ResponseEntity(new ErrorDto(RestError.VALIDATION_ERROR, e.getMessage()), HttpStatus.EXPECTATION_FAILED);
	}
}
