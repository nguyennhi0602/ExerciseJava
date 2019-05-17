public class Exercise24 {
    public int countFibonaciNumber(int number) {
        if (number == 0) {
            return 0;
        }
        int a0 = 1;
        int a1 = 1;
        int a2 = 2;
        int count = 1;
        while (a2 <= number) {
            a2 = a0 + a1;
            a0 = a1;
            a1 = a2;
            count++;
        }
        return count;
    }
}
