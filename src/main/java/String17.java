public class String17 {
    public String calculate(String num1, String num2) {
        StringBuffer result = new StringBuffer();
        int temp = num1.length() - num2.length();
        int suplus = 0;
        int minus = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            if (i - temp >= 0) {
                minus = (num1.charAt(i) - '0') - (num2.charAt(i - temp) - '0') + suplus;
                if ((num1.charAt(i) - '0') < (num2.charAt(i - temp) - '0')) {
                    minus = minus + 10;
                    result.insert(0, minus);
                    suplus = -1;
                } else {
                    result.insert(0, minus);
                    suplus = 0;
                }
            } else {
                minus = num1.charAt(i) - '0' + suplus;
                if (num1.charAt(i) == '0') {
                    minus += 10;
                    suplus = -1;
                } else {
                    suplus = 0;
                }
                result.insert(0, minus);
            }
        }
        if (result.charAt(0) == '0') {
            return result.toString().substring(1);
        }
        return result.toString();
    }
}
