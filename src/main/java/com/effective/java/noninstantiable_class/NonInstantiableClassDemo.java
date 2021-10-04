package com.effective.java.noninstantiable_class;

public class NonInstantiableClassDemo {
	public static void main(String args[]) {
		// this throws exception
		// WeatherUtil wu = new WeatherUtil();
		System.out.println(WeatherUtil.getTempUnits());
	}
}
