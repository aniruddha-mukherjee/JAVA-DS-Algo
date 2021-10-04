package com.design.pattern.factory;

public abstract class APizzaStore {


	public IPizza orderPizza(String pizzaType){
		IPizza pizza;
		pizza = createPizza(pizzaType);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	protected abstract IPizza createPizza(String pizzaType);
}
