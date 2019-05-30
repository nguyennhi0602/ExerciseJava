import java.util.Arrays;

public class Array18 {
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
        System.out.println(Arrays.toString(temp));
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                arr[i][j] = temp[index++];
                System.out.print(arr[i][j]+"  ");
                //index++;
            }
            System.out.println();
        }
        return arr;
    }
}
