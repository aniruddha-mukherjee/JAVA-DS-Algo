package com.design.pattern.decorator;

public class Mocha extends CondimentDecorator{

	public Mocha(Beverage beverage) {
		fBeverage = beverage;
	}

	@Override
	public double cost() {
		return fBeverage.cost()+.20;
	}

	@Override
	public String getDescription() {
		return fBeverage.getDescription()+ ", Mocha";
	}
}
