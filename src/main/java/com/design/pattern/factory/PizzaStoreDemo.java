package com.design.pattern.factory;

public class PizzaStoreDemo {
	public static void main(String[] args) {
		APizzaStore pizzaStore = new NYStylePizzaStore();
		pizzaStore.orderPizza("Veg");

		pizzaStore = new ChicagoStylePizzaStore();
		pizzaStore.orderPizza("Chicken");
	}
}
