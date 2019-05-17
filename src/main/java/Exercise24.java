public class Exercise24 {
    public int countFibonaciNumber(int number) {
        if (number == 0) {
            return 0;
        }
        int a0 = 1, a1 = 1, a3 = 2, count = 2;
        while (a3 <= number) {
            a3 = a0 + a1;
            a0 = a1;
            a1 = a3;
            count++;
        }
        return count;
    }
}
