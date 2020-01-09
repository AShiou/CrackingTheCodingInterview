public class Q3_replaceURL_oriArr {
    static String replaceURL(char[] str, int len) {
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (str[i] == ' ')
                spaceCount++;
        }
        int index = len + spaceCount * 2;
        for (int i = len - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index = index - 1;
            }
        }
        return new String(str);
    }
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        int len = 13;

        System.out.println(replaceURL(str.toCharArray(), len));
    }
}
