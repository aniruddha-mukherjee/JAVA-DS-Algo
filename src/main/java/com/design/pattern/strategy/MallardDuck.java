package com.design.pattern.strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		fFlyBehavior = new FlyWithWings();
		fQuackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm Mallard Duck");
	}
}
