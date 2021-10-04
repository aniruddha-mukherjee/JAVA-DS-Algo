package com.effective.java.static_factory_methods;

public class Service2G implements IService{
	@Override
	public void InternetService() {
		System.out.println("2g Internet");
	}

	@Override
	public void CallingService() {
		System.out.println("2g Calling");
	}

	@Override
	public void SMSService() {
		System.out.println("2g SMS");
	}
}
