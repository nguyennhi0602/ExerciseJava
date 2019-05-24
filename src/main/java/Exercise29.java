public class Exercise29 {
    public int getDecimalByRomaNumber(String romaNumber) {
        int result = 0;
        int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < decimal.length; i++) {
            while (romaNumber.indexOf(roman[i]) == 0) {
                result += decimal[i];
                romaNumber = romaNumber.substring(roman[i].length());
            }
        }
        return result;
    }
}
