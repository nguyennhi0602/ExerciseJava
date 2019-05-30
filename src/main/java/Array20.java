public class Array20 {
    public int[][] getSubMatrix(int[][] arr, int x, int y, int b, int n) {
        if ((x + b) > arr.length || (y + n) > arr[0].length) {
            return new int[][]{};
        }
        int[][] result = new int[b][n];
        int row = 0;
        for (int i = x; i < x + b; i++) {
            int col = 0;
            for (int j = y; j < y + n; j++) {
                result[row][col] = arr[i][j];
                col++;
            }
            row++;
        }
        return result;
    }
}
