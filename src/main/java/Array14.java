public class Array14 {
    public static int[] getArray(int[][] arr) {
        int[] result=new int[arr.length*arr[0].length];
        int index = 0;
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        int dir = 1;
        while (top <= bottom && left <= right) {
            if (dir == 1) {
                for (int i = left; i <= right; ++i) {
                    result[index] = arr[top][i];
                    index++;
                }
                ++top;
                dir = 2;
            } else if (dir == 2) {
                for (int i = top; i <= bottom; ++i) {
                    result[index] = arr[i][right];
                    index++;
                }
                --right;
                dir = 3;
            } else if (dir == 3) {
                for (int i = right; i >= left; --i) {
                    result[index] = arr[bottom][i];
                    index++;
                }
                --bottom;
                dir = 4;
            } else if (dir == 4) {
                for (int i = bottom; i >= top; --i) {
                    result[index] = arr[i][left];
                    index++;
                }
                ++left;
                dir = 1;
            }
        }
        return result;
    }
}
