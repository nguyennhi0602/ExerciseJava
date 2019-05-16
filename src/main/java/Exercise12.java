public class Exercise12 {
    public double calculateSum(int number) {
        if (number == 0) {
            return 1;
        }
        double result = 2;
        for (int i = 2; i <= number; i++) {
            int calculateFactorial = 1;
            for (int j = 1; j < i; j++) {
                calculateFactorial *= j;
            }
            result += (double) 1 / calculateFactorial / i;
        }
        return result;
    }
}
