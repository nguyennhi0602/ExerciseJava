public class Array6 {

    public int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (((arr[i] + arr[j]) % 2 == 0) && ((arr[i] > arr[j]) == (arr[i] % 2 == 0))) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
