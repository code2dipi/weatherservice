package com.dipi.weatherservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WeatherRestExceptionHandler {
	// Exception handler that will response to the client with JSON Format
	@ExceptionHandler
	public ResponseEntity<WeatherErrorResponse> handleException(WeatherNotFoundException exc) {
		WeatherErrorResponse error = new WeatherErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

	}

	// Generic (Exception e) handler which will handles all kinds of request
	// parameters
	@ExceptionHandler
	public ResponseEntity<WeatherErrorResponse> handleException(Exception e) {

		WeatherErrorResponse error = new WeatherErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());// BAD_REQUEST is 404
		// error.setMessage(e.getMessage());
		error.setMessage("Bad input type :input parameters was not number");
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

}
