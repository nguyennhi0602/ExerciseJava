public class String10 {
    public String getStringIsValid(String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int count1 = -count;
                count = count * 10 + Integer.parseInt(String.valueOf(str.charAt(i)));
                count1 += count;
                if (Character.isDigit(str.charAt(i + 1)) == false) {
                    count1 += -1;
                }
                while (count1 != 0) {
                    result += String.valueOf(result.charAt(result.length() - 1));
                    count1--;
                }
            } else {
                result += String.valueOf(str.charAt(i));
                count = 0;
            }
        }
        return result;
    }
}
