package ch1_ArraysAndStrings;

public class Q2_IsPermutationEqual_Array {
    static boolean isPermutation(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] letters = new int[128];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if(letters[t.charAt(i)] < 0)
                return false;
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
