package com.design.pattern.factory;

public class ChickenPizza extends APizza{
	@Override
	public void prepare() {
		System.out.println("preparing Chicken Pizza");
	}
}
