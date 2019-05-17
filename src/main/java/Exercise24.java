public class Exercise24 {
    public int countFibonaciNumber(int number) {
        if (number == 0) {
            return 0;
        }
        int a0 = 1, a1 = 1, a2 = 2, count = 2;
        while ((a2 <= number)) {
            a2 = a0 + a1;
            a0 = a1;
            a1 = a2;
            count++;
            if (a2 > number) {
                count--;
            }
        }
        return count;
    }
}
