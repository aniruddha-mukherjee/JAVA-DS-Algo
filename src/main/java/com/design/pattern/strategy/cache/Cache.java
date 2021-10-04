package com.design.pattern.strategy.cache;

import java.util.HashMap;
import java.util.Map;

public class Cache implements ICache{

	private Map<Integer, String> fDataMap;
	IEvictionPolicy fEvictionPolicy;
	int maxSize;

	public Cache(Map<Integer, String> dataMap, int maxSize, IEvictionPolicy evictionPolicy) {
		this.fDataMap = dataMap;
		this.maxSize = maxSize;
		this.fEvictionPolicy = evictionPolicy;
	}

	public Cache(int maxSize, IEvictionPolicy evictionPolicy) {
		fDataMap = new HashMap<>();
		this.maxSize = maxSize;
		this.fEvictionPolicy = evictionPolicy;
	}

	@Override
	public void put(int key, String value) {
		if (!fDataMap.containsKey(key)) {
			if (fDataMap.size() == maxSize) {
				fDataMap.remove(fEvictionPolicy.evict());
				fDataMap.put(key, value);
			}
			fEvictionPolicy.put(key);
		}
		fDataMap.put(key, value);
	}

	@Override
	public String get(int key) {
		if(!fDataMap.containsKey(key))
			return null;
		fEvictionPolicy.get(key);
		return fDataMap.get(key);
	}

	public void printCache(){
		fEvictionPolicy.printCache();
		System.out.print(fDataMap.toString());
	}
}
