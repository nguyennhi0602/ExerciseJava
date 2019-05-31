public class Array17 {
    public int[][] setArray(int n) {
        int[][] result = new int[n][n];
        int index = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int dir = 1;
        while (top <= bottom && left <= right) {
            if (dir == 1) {
                for (int i = left; i <= right; ++i) {
                    result[top][i] = index;
                    index++;
                }
                ++top;
                dir = 2;
            } else if (dir == 2) {
                for (int i = top; i <= bottom; ++i) {
                    result[i][right] = index;
                    index++;
                }
                --right;
                dir = 3;
            } else if (dir == 3) {
                for (int i = right; i >= left; --i) {
                    result[bottom][i] = index;
                    index++;
                }
                --bottom;
                dir = 4;
            } else if (dir == 4) {
                for (int i = bottom; i >= top; --i) {
                    result[i][left] = index;
                    index++;
                }
                ++left;
                dir = 1;
            }
        }
        return result;
    }
}
