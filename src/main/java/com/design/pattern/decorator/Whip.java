package com.design.pattern.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		fBeverage = beverage;
	}

	@Override
	public double cost() {
		double cost = fBeverage.cost();
		switch (getSize()) {
			case SMALL:
				cost += 0.10;
				break;
			case MEDIUM:
				cost += 0.20;
				break;
			case LARGE:
				cost += 0.30;
				break;
		}
		return cost;
	}

	@Override
	public String getDescription() {
		return fBeverage.getDescription() + ", Whip";
	}
}
