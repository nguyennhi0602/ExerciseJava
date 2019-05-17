public class Exercise26 {
    public int calculateCrazyFibonaci(int a0, int a1, int a2, int a3, int a4, int n) {
        int count = 5;
        int result = 0;
        while (count < n) {
            result = (a0 + a1 + a2 + a3 + a4) % 10;
            a0 = a1;
            a1 = a2;
            a2 = a3;
            a3 = a4;
            a4 = result;
            count++;
        }
        return result;
    }
}
