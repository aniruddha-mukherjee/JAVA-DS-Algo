package com.design.pattern.factory;

public class VegPizza extends APizza{
	@Override
	public void prepare() {
		System.out.println("Preparing Veg Pizza");
	}
}
