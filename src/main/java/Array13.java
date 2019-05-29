public class Array13 {
    public int[][] sortArray(int[][] arr) {
        int row=0;
        int col=0;
        int[][] result = new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=arr[i].length-1;j>=0;j--){
                result[row][col]=arr[j][i];
                col++;
            }
            row++;
        }
        return result;
    }
}
