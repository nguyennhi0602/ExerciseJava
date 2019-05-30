public class Array12 {
    public int[] sortArray(int[] arr, int n) {
        int index = 0;
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= n) {
                result[i] = arr[i];
                index = i + 1;
            }
        }
        result[index] = n;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }
}
