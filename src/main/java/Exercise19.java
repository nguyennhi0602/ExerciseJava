public class Exercise19 {

    public int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public int calculateC(int k, int n) {
        return calculateFactorial(n) / (calculateFactorial(k) * calculateFactorial(n - k));
    }

    public int[] calculatePascal(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[n] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = calculateC(i, n);
        }
        return arr;
    }
}
