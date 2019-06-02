public class Array3 {
    public int calculate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += 2 * ((1 - arr[i] & 1) * arr[i]) - arr[i];
        }
        return sum;
    }
}
