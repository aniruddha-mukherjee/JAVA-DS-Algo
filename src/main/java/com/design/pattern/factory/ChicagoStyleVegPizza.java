package com.design.pattern.factory;

public class ChicagoStyleVegPizza extends APizza{
	@Override
	public void prepare() {
		System.out.println("Preparing Chicago Style Veg Pizza with more cheese");
	}
}
