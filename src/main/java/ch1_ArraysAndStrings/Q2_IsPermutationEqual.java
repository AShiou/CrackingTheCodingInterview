package ch1_ArraysAndStrings;

import java.util.HashMap;

public class Q2_IsPermutationEqual {

    static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> charMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                int val = (charMap.get(s.charAt(i))).intValue();
                charMap.put(s.charAt(i), val + 1);
            } else {
                charMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (charMap.containsKey(t.charAt(i))) {
                int val = charMap.get(t.charAt(i)).intValue();
                if (val == 1) {
                    charMap.remove(t.charAt(i));
                } else {
                    charMap.put(t.charAt(i), val - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "paepl"}, {"baseball", "wsqellba"}, {"cat", "cats"}, {"", ""}};
        for (String[] pair: pairs) {
            String str1 = pair[0];
            String str2 = pair[1];
            System.out.println(isPermutation(str1, str2));
        }
    }
}
