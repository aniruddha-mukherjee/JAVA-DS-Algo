package com.effective.java.static_factory_methods;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
	private Services(){};
	private static final Map<String,IServiceProvider>providers = new ConcurrentHashMap<String,IServiceProvider>();
	public static final String DEFAULT_PROVIDER_NAME = "BSNL";

	public static void registerDefaultProvider(IServiceProvider p){
		registerProvider(DEFAULT_PROVIDER_NAME,p);
	}

	//Service Registration API
	public static void registerProvider(String name, IServiceProvider p){
		providers.put(name, p);
	}

	//Service Access API
	public static IService newInstance(String name){
		IServiceProvider p = providers.get(name);
		if(p==null)
			throw new IllegalArgumentException("No provider registered with name "+ name);
		return p.newService();
	}

	//default
	public static IService newInstance(){
		return newInstance(DEFAULT_PROVIDER_NAME);
	}

}
