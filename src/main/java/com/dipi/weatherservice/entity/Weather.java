package com.dipi.weatherservice.entity;

import java.time.LocalDateTime;
import java.util.Date;

import com.dipi.weatherservice.utils.DataUtils;

public class Weather {
	
	private String dateAndTime1;
	private Location location;
	private LocalDateTime dateAndTime;
	private int temp;
	private int precipitation;
	private String wind;
	public Weather() {
		
	}
	
	public Weather( String dateAndTime1,Location location, int temp, int precipitation,
			String wind) {
		this.dateAndTime1 = dateAndTime1;
		this.location = location;
		this.temp = temp;
		this.precipitation = precipitation;
		this.wind = wind;
	}

	public Weather(String dateAndTime1, int temp, int precipitation, String wind) {
		this.dateAndTime1 = dateAndTime1;
		this.temp = temp;
		this.precipitation = precipitation;
		this.wind = wind;
	}
	public Weather(LocalDateTime dateAndTime, int temp, int precipitation, String wind) {
		this.dateAndTime = dateAndTime;
		this.temp = temp;
		this.precipitation = precipitation;
		this.wind = wind;
	}
	
	
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getDateAndTime1() {
		return dateAndTime1;
	}
	public void setDateAndTime1(String dateAndTime1) {
		this.dateAndTime1 = dateAndTime1;
	}
	public LocalDateTime getdateAndTime() {
		return dateAndTime;
	}
	public void setLocalDateTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getPrecipitation() {
		return precipitation;
	}
	public void setPrecipitation(int precipitation) {
		this.precipitation = precipitation;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}

	
	
	

}
