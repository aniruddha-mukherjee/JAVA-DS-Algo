package com.design.pattern.strategy.cache;

public interface ICache {
	public void put(int key, String Value);
	public String get(int key);
}
