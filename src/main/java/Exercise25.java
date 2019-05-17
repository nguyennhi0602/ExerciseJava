public class Exercise25 {
    public int countFibonaciNumber(int m, int n) {
        if (n == 0) {
            return 0;
        }
        int a0 = 1;
        int a1 = 1;
        int a2 = 2;
        int count = 1;
        while ((a2 >= m) && (a2 <= n)) {
            a2 = a0 + a1;
            a0 = a1;
            a1 = a2;
            count++;
        }
        return count;
    }
}
