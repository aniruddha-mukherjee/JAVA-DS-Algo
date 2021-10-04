package com.effective.java.static_factory_methods;

public class Airtel implements IServiceProvider{
	@Override
	public IService newService() {
		return new Service4G();
	}
}
