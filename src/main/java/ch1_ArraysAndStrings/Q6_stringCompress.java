package ch1_ArraysAndStrings;

public class Q6_stringCompress {
    static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String[] strs = {"aabcccccaaa", "aabb", "a"};
        for (String str: strs) {
            System.out.println(compress(str));
        }
    }
}