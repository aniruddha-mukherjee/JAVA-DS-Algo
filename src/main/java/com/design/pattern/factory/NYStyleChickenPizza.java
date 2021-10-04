package com.design.pattern.factory;

public class NYStyleChickenPizza extends APizza{
	@Override
	public void prepare() {
		System.out.println("Preparing NY Style Chicken Pizza with less cheese");
	}
}
