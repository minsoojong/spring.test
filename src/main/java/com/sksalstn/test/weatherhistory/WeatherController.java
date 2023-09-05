package com.sksalstn.test.weatherhistory;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {
	
	public String createWeather(
			@DateTimeFormat(pattern="yyyy년MM월dd일") @RequestParam("date") Date date
			, @RequestParam("weather") String weather
			, @RequestParam("temperatures") double temperatures
			, @RequestParam("precipitation") double precipitation
			, @RequestParam("microDust") String microDust
			, @RequestParam("windSpeed") double windSpeed
			) {
		
//		int count = weatherService.addWeather (date, weather, temperatures, precipitation, microDust, windSpeed);
				
				return "redirect:/jstl/weather/list";
	}

}
