package com.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, IDisplayElement {

	private float lastPressure;
	private float currentPressure = 29.92f;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void display() {
		//display code here
	}

	@Override
	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherData){
			WeatherData weatherData =(WeatherData) observable;
			lastPressure = currentPressure;
			currentPressure =  weatherData.getPressure();
		}
		display();

	}
}
