package com.design.pattern.factory;

public class NYStylePizzaStore extends APizzaStore{
	@Override
	protected IPizza createPizza(String pizzaType) {
		switch (pizzaType){
			case "Veg": return new NYStyleVegPizza();
			case "Chicken": return new NYStyleChickenPizza();
		}
		return null;
	}
}
