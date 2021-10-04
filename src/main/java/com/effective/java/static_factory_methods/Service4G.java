package com.effective.java.static_factory_methods;

public class Service4G implements IService{
	@Override
	public void InternetService() {
		System.out.println("4g Internet");
	}

	@Override
	public void CallingService() {
		System.out.println("4g Calling");
	}

	@Override
	public void SMSService() {
		System.out.println("4g SMS");
	}
}
