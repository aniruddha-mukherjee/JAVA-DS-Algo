package com.design.pattern.factory;

public abstract class APizza implements IPizza{
	@Override
	public void bake(){
		System.out.println("Baking Pizza");
	}

	@Override
	public void cut(){
		System.out.println("Cutting Pizza");
	}

	@Override
	public void box(){
		System.out.println("Boxing Pizza");
	}
}
