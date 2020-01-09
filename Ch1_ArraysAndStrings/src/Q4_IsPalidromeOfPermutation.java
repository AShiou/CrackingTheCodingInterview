import java.util.HashSet;

public class Q4_IsPalidromeOfPermutation {

    static boolean isPalidromeOfPermutation(String str) {
        str = str.toLowerCase();
        HashSet charSet = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            if (checkAlphabet(str.charAt(i)) == true) {
                if (charSet.contains(str.charAt(i))) {
                    charSet.remove(str.charAt(i));
                } else {
                    charSet.add(str.charAt(i));
                }
            }
        }
        if (charSet.size() == 1 || charSet.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean checkAlphabet(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        String[] phrases = {"Tact Coa", "Tact Ca", "Apple", ""};
        for (String phrase: phrases) {
            System.out.println(phrase + ": " + isPalidromeOfPermutation(phrase));
        }
    }
}
