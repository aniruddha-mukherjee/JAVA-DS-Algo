package com.design.pattern.strategy;

public class NoFly implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
