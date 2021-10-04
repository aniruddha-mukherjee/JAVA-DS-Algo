package com.design.pattern.strategy.cache;

public interface IEvictionPolicy {
	void put(int key);
	void get(int key);
	int evict();
	void printCache();
}
