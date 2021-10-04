package com.effective.java.singleton;

public class SingletonWithPrivateConstructor {
	private String name;
	private static final SingletonWithPrivateConstructor INSTANCE = new SingletonWithPrivateConstructor("Ani");
	private SingletonWithPrivateConstructor(String name){
		this.name = name;
	};

	public String getName() {
		return name;
	}

	public static SingletonWithPrivateConstructor getInstance(){
		return INSTANCE;
	}
}
