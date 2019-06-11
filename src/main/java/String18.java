public class String18 {

    public String multiply(String a, int b) {
        if (b > 9) {
            return "";
        }
        StringBuffer result = new StringBuffer();
        int buff = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int mult = (a.charAt(i) - '0') * b + buff;
            result.insert(0, mult % 10);
            buff = mult / 10;
        }
        if (buff != 0) {
            result.insert(0, buff);
        }
        return result.toString();
    }

    public String calculate(String num1, String num2) {
        String result = "";
        for (int i = num2.length() - 1; i >= 0; i--) {
            String temp = multiply(num1, num2.charAt(i) - '0');
            int count = num2.length() - 1 - i;
            while (count != 0) {
                temp += "0";
                count--;
            }
            result = new String16().calculate(result, temp);
        }
        return result;
    }
}
