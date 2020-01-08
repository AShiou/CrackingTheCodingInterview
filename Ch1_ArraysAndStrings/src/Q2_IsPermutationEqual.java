import java.util.HashMap;

public class Q2_IsPermutationEqual {

    static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap charMap = new HashMap<String, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                int val = (int) charMap.get(s.charAt(i));
                charMap.put(s.charAt(i), val + 1);
            } else {
                charMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (charMap.containsKey(t.charAt(i))) {
                int val = (int)charMap.get(t.charAt(i));
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
