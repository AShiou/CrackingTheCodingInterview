package ch1_ArraysAndStrings;

public class Q4_IsPalidromeOfPermutation_Array {

    static boolean isPalidromeOfPermutation(String str) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c: str.toCharArray()) {
            int index = getCharNumber(c);
            if (index != -1) {
                table[index]++;
                if (table[index] % 2 == 1) {
                    countOdd++;
                } else
                    countOdd--;
            }
        }
        return countOdd <= 1;
    }

    static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        } else
            return -1;
    }
    public static void main(String[] args) {
        String[] phrases = {"Tact Coa", "Tact Ca", "Apple", ""};
        for (String phrase: phrases) {
            System.out.println(phrase + ": " + isPalidromeOfPermutation(phrase));
        }
    }
}