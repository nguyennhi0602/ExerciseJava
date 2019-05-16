public class Exercise18 {
    public int getDecimalByDecimal(int number) {
        int result = 0;
        while (number != 0) {
            result <<= 1;
            result |= number & 1;
            number >>= 1;
        }
        return result;
    }
}
