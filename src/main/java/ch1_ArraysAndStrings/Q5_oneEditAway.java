package ch1_ArraysAndStrings;

public class Q5_oneEditAway {
    static boolean isOneEditAway(String beforeStr, String afterStr) {
        if (beforeStr.length() == afterStr.length()) {
            return oneEditReplace(beforeStr, afterStr);
        } else if (beforeStr.length() + 1 == afterStr.length()) {
            return oneEditInsert(beforeStr, afterStr);
        } else if (beforeStr.length() == afterStr.length() + 1) {
            return oneEditInsert(afterStr, beforeStr); // delete
        }
        return false;
    }

    static boolean oneEditReplace(String s, String t) {
        boolean foundDifference = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (foundDifference) return false;
                foundDifference = true;
            }
        }
        return foundDifference;
    }

    static boolean oneEditInsert(String s, String t) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s.length() && index2 < t.length()) {
            if (s.charAt(index1) != t.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"pal", "pals"}, {"pals", "pal"}, {"pal", "pel"}, {"pal", "pal"}};
        for (String[] pair: pairs) {
            String str1 = pair[0];
            String str2 = pair[1];
            System.out.println(isOneEditAway(str1, str2));
        }
    }
}