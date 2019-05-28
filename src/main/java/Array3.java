public class Array3 {
    public int calculate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (1 - (arr[i] & 1 * 2)) * arr[i];
        }
        return sum;
    }
}
