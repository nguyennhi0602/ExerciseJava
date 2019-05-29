public class Array9 {
    public int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}
