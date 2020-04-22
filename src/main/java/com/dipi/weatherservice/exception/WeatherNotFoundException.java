package com.dipi.weatherservice.exception;


//Custom RunTime Exception
public class WeatherNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WeatherNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeatherNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public WeatherNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public WeatherNotFoundException(String message) {
		super(message);
		
	}

	public WeatherNotFoundException(Throwable cause) {
		super(cause);
		
	}

	

}
