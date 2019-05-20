public class Exercise25 {
    public int countFibonaciNumber(int m, int n) {
        int a0 = 0;
        int a1 = 1;
        int a2 = 1;
        int count = 0;
        while (a1 <= n) {
            a2 = a0 + a1;
            a0 = a1;
            a1 = a2;
            if (a0 >= m) {
                count++;
            }
        }
        return count;
    }
}
