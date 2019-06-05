public class String7 {
    public int getIndexOfSubString(String str, String subStr) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            while (index < subStr.length() && (str.charAt(i) == subStr.charAt(index))) {
                index++;
            }
            if (index == subStr.length()) {
                return i - index + 1;
            }
        }
        return -1;
    }
}
