package com.sksalstn.test.weatherhistory.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sksalstn.test.weatherhistory.domain.Weather;

@Repository
public interface WeatherRepository {
	
	public List<Weather> selectWeatherHistory();

}


	public int insertWeather(
							@Param("date")String date
							, @Param("weather")String weather
							, @Param("temperatures")double temperatures
							, @Param("precipitation")double precipitation
							, @Param("microDust")String microDust
							, @Param("windSpeed")double windSpeed);