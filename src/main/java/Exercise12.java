public class Exercise12 {
    public int calculateFactorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public double calculateSum(int number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result += (double) 1 / calculateFactorial(i - 1) / i;
        }
        return result;
    }
}
