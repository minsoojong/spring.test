package com.sksalstn.test.weatherhistory;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sksalstn.test.weatherhistory.domain.Weather;
import com.sksalstn.test.weatherhistory.service.WeatherService;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/jstl/weather/list")
	public String weatherhistort(Model model) {
		
		List<Weather> weatherhistory = weatherService.getWeatherHistory();
		
		model.addAttribute("weatherhistory", weatherhistory);
		
		
		return "jstl/test06";
	}
	
	
	
	@GetMapping("/create")
	@ResponseBody
	public String createWeather(
			// 2023년09월07일
			@DateTimeFormat(pattern="yyyy년MM월dd일") @RequestParam("date")Date date
			, @RequestParam("weather")String weather
			, @RequestParam("temperatures")double temperatures
			, @RequestParam("precipitation")double precipitation
			, @RequestParam("microDust")String microDust
			, @RequestParam("windSpeed")double windSpeed) {
		
		int count = weatherService.addWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		return  "redirect:/test07";
	}
	
	

}
