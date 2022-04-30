package com.interview.karat;

public class Karat2 {
    public static void main(String[] argv) {
        String[] words = new String[] { "cat", "baby", "dog", "bird", "car", "ax"};
        String string1 = "tcabnihjs";
        String string2 = "tbcanihjs";
        String string3 = "baykkjl";
        String string4 = "bbabylkkj";
        String string5 = "ccc";
        String string6 = "breadmaking";

        findWord(words, string6);
    }

    public static void findWord(String[] words, String string) {
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean found = true;
            String str = string;
            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                if (!str.contains(letter + "")) {
                    found = false;
                    break;
                } else {
                    int index = str.indexOf(letter + "");
                    str = str.substring(0, index) + str.substring(index + 1);
                }
            }
            if (found == true) {
                result = word;
            }
        }

        System.out.println(result);
    }
}