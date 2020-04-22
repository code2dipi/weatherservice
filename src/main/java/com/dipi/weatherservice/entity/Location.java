package com.dipi.weatherservice.entity;

public class Location {
	private String country;
	private String city;
	private Code code;
	
	public Location() {
		
	}
	public Location(String country, String city,Code code) {
		this.country = country;
		this.city = city;
		this.code=code;
		
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Code getCode() {
		return code;
	}
	
	
}
