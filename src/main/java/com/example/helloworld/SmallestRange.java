package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestRange {

	public int[] smallestRange(List<List<Integer>> nums) {
		int[] smallest =  new int[2];
		smallest[0] = 0;   //min
		smallest[1] =  Integer.MAX_VALUE; //max
		int count = 0;
		for(int i = 0; i < nums.size();i++)
			for(int j = 0;j < nums.get(i).size();j++)
				for(int k = i+1; k < nums.size(); k++)
					for(int l = 0 ; l < nums.get(k).size(); l++) {
						//System.out.println(nums.get(i).get(j) + "," + nums.get(k).get(l));
						//count++;
						int min = Math.min(nums.get(i).get(j) , nums.get(k).get(l));
						int max = Math.max(nums.get(i).get(j) , nums.get(k).get(l));
						int n,m;
						for(m = 0; m< nums.size(); m++) {
							for (n = 0; n < nums.get(m).size(); n++)
								if (nums.get(m).get(n) >= min && nums.get(m).get(n) <= max)
									break;

							// if for one range, no element was found in between
							if(n == nums.get(m).size())
								break;
						}

						if(m == nums.size()){
							if(smallest[1] - smallest[0] > max - min ){
								smallest[0] = min;
								smallest[1] = max;
							}
						}

					}
		//System.out.println(count);
		return smallest;
	}

	public static void main(String[] args){
		List<List<Integer>> nums=  new ArrayList<List<Integer>>();

		//nums.add(Arrays.asList(4,10,15,24,26));
		//nums.add(Arrays.asList(0,9,12,20));
		//nums.add(Arrays.asList(5,18,22,30));

		nums.add(Arrays.asList(0,6));
		nums.add(Arrays.asList(4,10));
		nums.add(Arrays.asList(5,18));

		int[] result = new SmallestRange().smallestRange(nums);
		System.out.println(result[0] + "," + result[1]);
	}
}
