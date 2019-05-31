public class Array21 {
    public int[][] getSubMatrix(int[][] arr, int x, int y) {
        if (x >= arr.length || y >= arr[0].length) {
            return arr;
        }
        int row = 0;
        int[][] result = new int[arr.length - 1][arr[0].length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == x) {
                continue;
            }
            int col = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (j == y) {
                    continue;
                }
                result[row][col] = arr[i][j];
                col++;
            }
            row++;
        }
        return result;
    }
}
