package com.design.pattern.strategy;

public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I flying powered by rocket");
	}
}
