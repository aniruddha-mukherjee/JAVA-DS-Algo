package com.design.pattern.factory;

public class NYStyleVegPizza extends APizza{
	@Override
	public void prepare() {
		System.out.println("Preparing NY Style Veg Pizza with less cheese");
	}
}
