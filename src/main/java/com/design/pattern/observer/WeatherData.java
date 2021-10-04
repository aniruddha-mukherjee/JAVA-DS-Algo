package com.design.pattern.observer;
import  java.util.Observable;

public class WeatherData extends Observable{
	private float temp;
	private float pressure;

	public float getPressure() {
		return pressure;
	}

	public float getTemp() {
		return temp;
	}

	private void setTemp(float temp) {
		this.temp = temp;
	}

	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temp){
		setTemp(temp);
		measurementsChanged();
	}

}
