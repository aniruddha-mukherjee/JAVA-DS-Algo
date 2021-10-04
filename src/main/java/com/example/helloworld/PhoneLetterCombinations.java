package com.example.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombinations {
	public List<String> letterCombinations(String digits) {
		List<String> answer = new ArrayList<String>();
		letterCombinationsUtil (digits,0,info,answer);
		Map<Integer, char[]> info = new HashMap<Integer, char[]>();
		info.put(1, new char[]{'1'});
		info.put(2, new char[]{'a', 'b', 'c'});
		info.put(3, new char[]{'d', 'e', 'f'});
		info.put(4, new char[]{'g', 'h', 'i'});
		info.put(5, new char[]{'j', 'k', 'k'});
		info.put(6, new char[]{'m', 'n', 'o'});
		info.put(7, new char[]{'p', 'q', 'r','s'});
		info.put(8, new char[]{'t', 'u', 'v'});
		info.put(9, new char[]{'w', 'x', 'y','z'});
		return answer;
	}
}
//
//class Solution {
//
//}
