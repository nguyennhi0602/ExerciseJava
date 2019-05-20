public class Exercise19 {
    public int[] calculatePascal(int n) {
        int[] previousRow;
        int[] currentRow = {1};
        previousRow = currentRow;
        for (int i = 1; i <= n+1; i++) {
            currentRow = new int[i];
            currentRow[0] = 1;
            currentRow[i - 1] = 1;
            for (int j = 0; j <= i - 3; j++) {
                currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
            }
            previousRow = currentRow;
        }
        return currentRow;
    }
}
