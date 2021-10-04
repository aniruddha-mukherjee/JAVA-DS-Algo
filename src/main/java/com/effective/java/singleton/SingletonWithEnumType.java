package com.effective.java.singleton;

public enum SingletonWithEnumType {
	INSTANCE("Ani");

	private String name;

	SingletonWithEnumType(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}
}
