package ch1_ArraysAndStrings;

import java.util.HashSet;

public class Q1_IsUniqueChars {

    public static boolean isUniqueChars(String str) {
        HashSet charSet = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            if (charSet.contains(str.charAt(i))) {
                return false;
            }
            charSet.add(str.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "ball", "cat", ""};
        for (String word : words) {
            System.out.println(word + ":" + isUniqueChars(word));
        }
    }
}


