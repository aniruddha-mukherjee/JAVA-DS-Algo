package com.design.pattern.factory;

public class ChicagoStylePizzaStore extends APizzaStore{
	@Override
	protected IPizza createPizza(String pizzaType) {
		switch (pizzaType){
			case "Veg": return new ChicagoStyleVegPizza();
			case "Chicken": return new ChicagoStyleChickenPizza();
		}
		return null;
	}
}
