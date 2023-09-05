package com.sksalstn.test.weatherhistory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sksalstn.test.weatherhistory.domain.Weather;
import com.sksalstn.test.weatherhistory.repository.WeatherRepository;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository weatherRepository;

	public List<Weather> getWeatherHistory () {
		List<Weather> weatherhistory = weatherRepository.selectWeatherHistory();
		
		return weatherhistory;
		
	}
	
	
	
	public int addWeather(
			String date
			, String weather
			, double temperatures
			, double precipitation
			, String microDust
			, double windSpeed) {
		
		int count = weatherRepository.insertWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		return count;
	}
	
	
		
	}

