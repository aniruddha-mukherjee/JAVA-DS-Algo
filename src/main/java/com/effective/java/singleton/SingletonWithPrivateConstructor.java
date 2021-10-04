package com.effective.java.singleton;

public class Singleton_withPrivate_Constructor {
	private static final Singleton_withPrivate_Constructor  INSTANCE = new Singleton_withPrivate_Constructor();
	private Singleton_withPrivate_Constructor(){};

	public static Singleton_withPrivate_Constructor getInstance(){
		return INSTANCE;
	}
}
