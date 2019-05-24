public class Exercise30 {

    private static int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public int getFloorIndex(int number) {
        for (int i = decimal.length - 1; i >= 0; i--) {
            if (decimal[i] > number) {
                return i + 1;
            }
        }
        return 0;
    }

    public String getRomaNumberByDecimalNumber(int number) {
        int l = getFloorIndex(number);
        if (number == decimal[l]) {
            return roman[l];
        }
        return roman[l] + getRomaNumberByDecimalNumber(number - decimal[l]);
    }
}
