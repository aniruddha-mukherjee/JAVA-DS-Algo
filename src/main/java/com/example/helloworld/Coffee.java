package com.example.helloworld;

enum CoffeeSize{
	BIG(8), HUGE(10), OVERWHELMING(16){
		public int getOunces(){
			return -1;
		}
	};
	CoffeeSize(int ounces){
		this.ounces =  ounces;
	}
	private int ounces;
	public int getOunces(){
		return ounces;
	}
}

public class Coffee {
	CoffeeSize size;
	public static void main(String[] args){
		Coffee drink1  = new Coffee();
		drink1.size =  CoffeeSize.BIG;

		Coffee drink2  = new Coffee();
		drink2.size =  CoffeeSize.HUGE;

		//System.out.println(drink1.size.getOunces());
		//System.out.println(drink2.size.getOunces());

		for(CoffeeSize cs : CoffeeSize.values()){
			System.out.println(cs+ " "+cs.getOunces());
		}
	}
}
