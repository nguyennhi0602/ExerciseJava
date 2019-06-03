public class String9 {
    public String getStringIsValid(String str) {
        String result = "";
        int count = 1;
        str = str + " ";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                continue;
            }
            if (count > 1) {
                result += String.valueOf(str.charAt(i)) + count;
            } else {
                result += String.valueOf(str.charAt(i));
            }
            count = 1;
        }
        return result;
    }
}
