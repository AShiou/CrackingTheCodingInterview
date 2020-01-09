public class Q3_replaceURL {
    static String replaceURL(String str, int len) {
        String[] strArr = str.split(" ");
        String res = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            res = res + "%20" + strArr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        int len = 13;
        System.out.println(replaceURL(str, len));
    }
}
