package com.design.pattern.decorator;

public class Soy extends CondimentDecorator{

	public Soy(Beverage beverage) {
		fBeverage = beverage;
	}

	@Override
	public double cost() {
		return fBeverage.cost()+.15;
	}

	@Override
	public String getDescription() {
		return fBeverage.getDescription()+", Soy";
	}
}
