public class Exercise27 {
    public int countZeroNumber(int number) {
        int count = 0;
        for (int i = 5; i <= number; i *= 5) {
            count += number / i;
        }
        return count;
    }
}
