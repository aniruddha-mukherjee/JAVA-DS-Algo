package com.effective.java.noninstantiable_class;

public class WeatherUtil {
	private WeatherUtil(){};

	public static String getTempUnits(){
		return "Celcius";
	}
}
