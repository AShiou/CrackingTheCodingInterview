public class Q4_IsPalidromeOfPermutation_bitVector {

    static boolean isPalidromeOfPermutation(String str) {
        int bitVector = createBitVector(str);
        return bitVector ==0 || checkExactlyOneBitSet(bitVector);
    }

    static boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

    static int createBitVector(String str) {
        int bitVector = 0;
        for (char c: str.toCharArray()) {
            int x = getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
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

    static int toggle(int bitVector, int index) {
        if (index < 0 ) return bitVector;
        int mask = 1 << index;
        if ((bitVector & mask) == 0) {
            bitVector = bitVector | mask;
        } else {
            bitVector = bitVector & (~mask);
        }
        return bitVector;
    }

    public static void main(String[] args) {
        String[] phrases = {"Tact Coa", "Tact Ca", "Apple", ""};
        for (String phrase: phrases) {
            System.out.println(phrase + ": " + isPalidromeOfPermutation(phrase));
        }
    }
}