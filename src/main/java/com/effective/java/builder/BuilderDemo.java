package com.effective.java.builder;

public class BuilderDemo {
	public static void main(String args[]) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 100).carbs(27).fat(100).build();
	}
}
