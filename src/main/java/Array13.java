public class Array13 {
    public int[][] sortArray(int[][] arr) {
        int[][] result = new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for (int j = arr.length - 1; j >= 0; j--) {
                result[i][result.length - j] = arr[j][i];
            }
        }
        return result;
    }
}
