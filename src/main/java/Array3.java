public class Array3 {
    public int calculate(int[] arr) {
        int sum = 0;
        int sumEvenNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEvenNumber += arr[i];
            }
            sum += arr[i];
        }
        return 2 * sumEvenNumber - sum;
    }
}
