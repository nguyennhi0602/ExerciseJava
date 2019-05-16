public class Exercise18 {
    public int getDecimalByDecimal(int number) {
        String convertBinaryResult = "";
        while (number > 0) {
            convertBinaryResult += (number % 2) + "";
            number /= 2;
        }
        int result = 0;
        for (int i = convertBinaryResult.length() - 1; i >= 0; i--) {
            double temp = Math.pow(2, convertBinaryResult.length() - 1 - i);
            result += Integer.parseInt(String.valueOf(convertBinaryResult.charAt(i))) * temp;
        }
        return result;
    }
}
