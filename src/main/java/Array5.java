public class Array5 {
    public boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getArray(int[] arr) {
        int result = 0;
        for (Integer ele : arr) {
            if (isPrimeNumber(ele)) {
                result += ele;
            }
        }
        return result;
    }
}
