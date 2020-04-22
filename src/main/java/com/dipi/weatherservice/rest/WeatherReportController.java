package com.dipi.weatherservice.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.annotation.PostConstruct;
import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.cglib.core.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipi.weatherservice.entity.Location;
import com.dipi.weatherservice.entity.Weather;
import com.dipi.weatherservice.exception.WeatherNotFoundException;
import com.dipi.weatherservice.entity.Code;


@RestController
@RequestMapping("/api")


public class WeatherReportController {
	List<Weather> listWeather;
	//Expose /weathers and get list of weathers
	@GetMapping("/weathers")
	@PostConstruct
	public  List<Weather> findAll() throws ParseException{
		List<Weather> listWeather=new ArrayList<Weather>();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		//DateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String dateAndTime=LocalDateTime.now().format(formatter);
		
		listWeather.add(new Weather(dateAndTime,new Location("Norway","Oslo",Code.OS_NO),12,3, "Light air, 1 m/s from west-northwest"));
		listWeather.add(new Weather(dateAndTime,new Location("Norway", "Bergen",Code.BE_NO),13,1,"Light air, 1 m/s from west-northwest"));
		listWeather.add(new Weather(dateAndTime,new Location("Norway","Lillehammer",Code.LIL_NO),16,0,"Light air, 1 m/s from south-southwest"));
		listWeather.add(new Weather(dateAndTime,new Location("Norway", "Stavanger",Code.STA_NO),14,0,"Gentle breeze, 4 m/s from southwest"));
		listWeather.add(new Weather(dateAndTime,new Location("Norway", "Trondheim",Code.TR_NO),15,0,"Light breeze, 2 m/s from east-northeast"));
	
		return listWeather;
	}
	//Get weather by Temperature
	@SuppressWarnings({ "unchecked", "unused" })
	@GetMapping("/weathers/temp/{temp}")
	public Weather getWeatherByTemp(@PathVariable int temp) throws ParseException {
		for(Weather weather: listWeather) {
			if(weather.getTemp()==temp) {
				return weather;
			}
			
		}
		throw new WeatherNotFoundException("Temperature is not Found:"+ temp);

	}
		
	
	@SuppressWarnings("unused")
	@GetMapping("/weathers/city/{city}")
	public Weather findWeatherByCity(@PathVariable String city) throws ParseException {
		Weather myweather=null;
		
			Iterator<Weather> iterator=listWeather.listIterator();
			
			while(iterator.hasNext()) {
				myweather=iterator.next();
				if(myweather.getLocation().getCity().equals(city)) {
					System.out.println(myweather);

					return myweather;
					
			}
		}
			
			throw new WeatherNotFoundException("City is not Found:"+ city);

		
	}
	
	
	

}
