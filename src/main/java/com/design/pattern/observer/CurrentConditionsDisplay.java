package com.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay implements Observer, IDisplayElement {
	Observable  fObservable;
	public float temperature;

	public float getTemperature() {
		return temperature;
	}

	public CurrentConditionsDisplay(Observable observable) {
		fObservable = observable;
		fObservable.addObserver(this);
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	@Override
	public void update(Observable o, Object arg) {
		WeatherData weatherData = (WeatherData) o;
		setTemperature(weatherData.getTemp());
		display();
	}

	@Override
	public void display() {
		System.out.println("Conditions display temperature is: " + getTemperature());
	}
}
