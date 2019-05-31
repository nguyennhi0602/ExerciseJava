public class Array26 {
    public int reverseNumber(int n) {
        if (n < 10) {
            return n;
        }
        int result = 0;
        while (n > 0) {
            int surplus = n % 10;
            result = result * 10 + surplus;
            n = n / 10;
        }
        return result;
    }

    public int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += reverseNumber(arr[i]);
        }
        return sum;
    }
}
