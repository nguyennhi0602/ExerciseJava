public class Array19 {
    public int[][] sortArray(int[][] arr) {
        int[] temp = new int[arr.length * arr[0].length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp[index] = arr[i][j];
                index++;
            }
        }
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] > temp[j]) {
                    int tmp = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tmp;
                }
            }
        }
        index = 0;
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        int dir = 1;
        while (top <= bottom && left <= right) {
            if (dir == 1) {
                for (int i = left; i <= right; ++i) {
                    arr[top][i] = temp[index];
                    index++;
                }
                ++top;
                dir = 2;
            } else if (dir == 2) {
                for (int i = top; i <= bottom; ++i) {
                    arr[i][right] = temp[index];
                    index++;
                }
                --right;
                dir = 3;
            } else if (dir == 3) {
                for (int i = right; i >= left; --i) {
                    arr[bottom][i] = temp[index];
                    index++;
                }
                --bottom;
                dir = 4;
            } else if (dir == 4) {
                for (int i = bottom; i >= top; --i) {
                    arr[i][left] = temp[index];
                    index++;
                }
                ++left;
                dir = 1;
            }
        }
        return arr;
    }
}
