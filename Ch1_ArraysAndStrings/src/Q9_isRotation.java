import java.util.Random;

public class Q9_isRotation {
    static boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if (len != s2.length() || len <= 0) return false;
        String s1s1 = s1 + s1;
        return isSubString(s1s1, s2);
    }

    static boolean isSubString(String s1, String s2) {
        if (s1.indexOf(s2) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isRotation(s1, s2));
    }
}