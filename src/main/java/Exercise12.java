public class Exercise12 {
    public double calculateSum(int number) {
        double current = 1;
        double result = 1;
        for (int i = 1; i <= number; i++) {
            current /= i;
            result += current;
        }
        return result;
    }
}
