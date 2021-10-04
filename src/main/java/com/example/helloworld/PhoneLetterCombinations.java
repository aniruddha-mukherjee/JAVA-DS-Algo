package com.example.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneLetterCombinations {
	public static void main(String args[]) {
		List<String> ans = new PhoneLetterCombinations().letterCombinations("23");
		ans.forEach(x -> System.out.println(x));
	}

	public List<String> letterCombinations(String digits) {
		List<String> answerList = new ArrayList<String>();
		if(digits.isEmpty())
			return answerList;
		Map<Integer, char[]> info = new HashMap<Integer, char[]>();
		info.put(1, new char[]{'1'});
		info.put(2, new char[]{'a', 'b', 'c'});
		info.put(3, new char[]{'d', 'e', 'f'});
		info.put(4, new char[]{'g', 'h', 'i'});
		info.put(5, new char[]{'j', 'k', 'l'});
		info.put(6, new char[]{'m', 'n', 'o'});
		info.put(7, new char[]{'p', 'q', 'r', 's'});
		info.put(8, new char[]{'t', 'u', 'v'});
		info.put(9, new char[]{'w', 'x', 'y', 'z'});
		letterCombinationsUtil(digits, 0, info, "", answerList);
		return answerList;
	}

	public void letterCombinationsUtil(String digits, int currentIndex, Map<Integer, char[]> info, String currentAnswer, List<String> answerList) {
		if (currentIndex == digits.length() ) {
			answerList.add(currentAnswer);
			return;
		}

		int currDigit = Character.getNumericValue(digits.charAt(currentIndex));

		for (char c : info.get(currDigit)) {
			String newCombination = currentAnswer + c;
			letterCombinationsUtil(digits, currentIndex + 1, info, newCombination, answerList);
		}

	}
}
//
//class Solution {
//
//}
