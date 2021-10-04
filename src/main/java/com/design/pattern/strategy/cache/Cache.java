package com.design.pattern.strategy.cache;

import java.util.Map;

public abstract class ACache implements ICache{

	private Map<Integer, String> fDataMap;
	IEvictionPolicy fEvictionPolicy;
	int maxSize;

	public ACache(Map<Integer, String> dataMap, IEvictionPolicy evictionPolicy) {
		this.fDataMap = dataMap;
		this.fEvictionPolicy = evictionPolicy;
	}

	public ACache(int maxSize, IEvictionPolicy evictionPolicy) {
		this.maxSize = maxSize;
		this.fEvictionPolicy = evictionPolicy;
	}

	@Override
	public void put(int key, String value) {
		if (!fDataMap.containsKey(key)) {
			if (fDataMap.size() == maxSize) {
				fEvictionPolicy.evict();
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
}
