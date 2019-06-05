public class String16 {

    public String calculate(String num1, String num2) {
        StringBuffer result = new StringBuffer();
        int temp = num2.length() - num1.length();
        int surplus = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            if (i - temp >= 0) {
                int sum = num2.charAt(i) - '0' + num1.charAt(i - temp) - '0';
                result.insert(0, (sum + surplus) % 10);
                surplus = (sum + surplus) / 10;
            } else {
                result.insert(0, (num2.charAt(i) - '0' + surplus) % 10);
                surplus = (num2.charAt(i) - '0' + surplus) / 10;
            }
        }
        if (surplus == 1) {
            result.insert(0, surplus);
        }
        return result.toString();
    }
}
