package com.design.pattern.decorator;

public abstract class CondimentDecorator extends Beverage{
	Beverage fBeverage;
	public abstract String getDescription();

	public Size getSize(){
		return fBeverage.getSize();
	}
}
