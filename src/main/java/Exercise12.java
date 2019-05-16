public class Exercise12 {
    public int calculateFactorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public double calculateSum(int number) {
        double result = 0;
        for (int i = 0; i < number; i++) {
            result += 1 / calculateFactorial(i);
        }
        return result;
    }
}
