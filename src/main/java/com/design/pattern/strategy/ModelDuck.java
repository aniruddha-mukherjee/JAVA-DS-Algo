package com.design.pattern.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		fFlyBehavior = new NoFly();
		fQuackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm Model duck");
	}
}
