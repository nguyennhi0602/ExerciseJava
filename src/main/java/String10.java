public class String10 {
    public String getStringIsValid(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int count = Integer.parseInt(String.valueOf(str.charAt(i))) - 1;
                while (count != 0) {
                    result += String.valueOf(str.charAt(i - 1));
                    count--;
                }
            } else {
                result += String.valueOf(str.charAt(i));
            }
        }
        return result;
    }
}
