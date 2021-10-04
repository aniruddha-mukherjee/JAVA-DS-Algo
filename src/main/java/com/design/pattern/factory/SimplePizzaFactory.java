package com.design.pattern.factory;

public class SimplePizzaFactory {
	public IPizza createPizza(String pizzaType){
		switch (pizzaType){
			case "Veg": return new VegPizza();
			case "Chicken": return new ChickenPizza();
		}
		return null;
	}
}
