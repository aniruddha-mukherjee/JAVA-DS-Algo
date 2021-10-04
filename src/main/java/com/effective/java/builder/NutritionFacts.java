package com.effective.java.builder;

public class NutritionFacts {
	private final int servingsSize;
	private final int calories;


	//optional
	private final int fat;
	private final int carbs;
	private final int protein;

	public static class Builder {
		private final int servingsSize;
		private final int calories;

		//Optional
		private int fat = 0;
		private int carbs = 0;
		private int protein = 0;

		public Builder(int servingsSize, int calories) {
			this.servingsSize = servingsSize;
			this.calories = calories;
		}

		public Builder fat(int val) {
			this.fat = val;
			return this;
		}

		public Builder protein(int val) {
			this.protein = val;
			return this;
		}

		public Builder carbs(int val) {
			this.carbs = val;
			return this;
		}

		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(Builder builder){
		servingsSize = builder.servingsSize;
		calories= builder.calories;
		//optional
		fat= builder.fat;
		carbs= builder.carbs;
		protein=builder.protein;
	}
}
