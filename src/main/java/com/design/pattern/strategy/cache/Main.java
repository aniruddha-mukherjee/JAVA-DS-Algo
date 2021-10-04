package com.design.pattern.strategy.cache;

public class Main {
	public static void main(String[] args) {
		Cache cache = new Cache(2, new LRUEvictionPolicy());
		cache.put(1, "Ani1");
		cache.printCache();
		cache.put(2, "Ani2");
		cache.printCache();
		cache.get(2);
		cache.printCache();
		cache.get(1);
		cache.printCache();
		cache.put(3, "Ani3");
		cache.printCache();
		cache.get(3);

		//System.out.println(cache.get(1));
		cache.printCache();
	}
}
