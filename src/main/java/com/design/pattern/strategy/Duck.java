package com.design.pattern.strategy;

public abstract class Duck {
	protected FlyBehavior fFlyBehavior;
	protected QuackBehavior fQuackBehavior;

	public abstract void display();

	public void fly(){
		fFlyBehavior.fly();
	}

	public void quack(){
		fQuackBehavior.quack();
	}

	public void swim(){
		System.out.println("All ducks swim");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior){
		fFlyBehavior =  flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior){
		fQuackBehavior =  quackBehavior;
	}
}
