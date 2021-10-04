package com.effective.java.no.unnecessary.objects;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NoUnnecessaryObjectsDemo {
	public static void main(String args[]) {
		System.out.println(Boolean.valueOf("TRUE"));

		Map<Integer, Integer> map = new HashMap<Integer,Integer>();

		map.put(1,1);

		Set<Integer> mapKeySet = map.keySet();

		mapKeySet.forEach(x -> System.out.println(x));

		System.out.println("After");

		//mapKeySet.add(2); //UnsupportedOperationException
		map.put(2,2);
		mapKeySet.forEach(x -> System.out.println(x));
	}
}
