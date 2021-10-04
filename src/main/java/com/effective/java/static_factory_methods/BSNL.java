package com.effective.java.static_factory_methods;

public class BSNL implements IServiceProvider{
	@Override
	public IService newService() {
		return new Service2G();
	}
}
