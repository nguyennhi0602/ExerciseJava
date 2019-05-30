public class Array10 {
    public int[][] minusArray(int[] arr, int n) {
        int mid = (int) Math.ceil((double) arr.length / n);
        int[][] result = new int[n][mid];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (index >= arr.length) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = arr[index];
                }
                index++;
            }
        }
        return result;
    }
}
