package com.design.pattern.strategy;

public class MiniDuckSimulator {
	public static void main(String[] args){
//		Duck duck = new ModelDuck();
//		duck.quack();
//		duck.fly();
//		duck.swim();
//		duck.display();
//
//		duck.setFlyBehavior(new FlyRocketPowered());
//		duck.fly();

		DuckCall duckCall =  new DuckCall();
		duckCall.quack();
		duckCall.display();
	}
}
