public class String10 {
    public String getStringIsValid(String str) {
        StringBuffer result = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char temp = str.charAt(i);
            result.append(temp);
            i++;
            String number = "0";
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                number += str.charAt(i);
                i++;
            }
            for (int j = 1; j < Integer.valueOf(number); j++) {
                result.append(temp);
            }
        }
        return result.toString();
    }
}
