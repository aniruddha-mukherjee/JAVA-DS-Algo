package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HelloWorld {
	public static void main(String[] args) {

	}

	public static void testNotNull(List<Integer> list) {
		if (list == null)
			new TestNullable().foo(list);
	}

	public static int returnOtherindex(Integer[] arr, int notIndex) {
		for (Integer i : arr) {
			if (i.intValue() != notIndex)
				return i.intValue();
		}
		return -1;
	}

	public static int findStrength(String input, int start) {
		int sum = 0;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < input.length(); i++)
			sum += (alphabet.indexOf(input.charAt(i)) + start ) % 26;
		return sum;
	}
	
	/*public static int[] findPair(int[] arr, int sum){
		Map<Integer, Integer[]> hash =  new HashMap<Integer, Integer[]>();
		int firstIndex=-1,secondIndex=-1;
		
		for(int i=0;i<arr.length;i++){
			if(hash.containsKey(sum - arr[i])){
				int idx = returnOtherindex(hash.get(sum-arr[i]),i);
				if(idx!=-1)
					return new int[]= {i,idx};
			}
		}

		return arr;
	}*/

	public boolean isGreater(int n1, int n2) {
		return n1 > n2;
	}
}
