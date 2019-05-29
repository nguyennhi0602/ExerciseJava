public class Array12 {
    public int[] sortArray(int[] arr, int n) {
        int index = arr.length - 1;
        int[] result = new int[arr.length + 1];
        boolean inserted = false;
        for (int i = arr.length; i >= 0; i--) {
            if (arr[index] > n) {
                result[i] = arr[index--];
            } else {
                if (!inserted) {
                    result[i] = n;
                    inserted = true;
                } else {
                    result[i] = arr[index--];
                }
            }
        }
        return result;
    }

}
