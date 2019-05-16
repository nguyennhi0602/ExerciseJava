public class Exercise20 {
    public int caculateFibonaci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } else {
            return caculateFibonaci(number - 1) + caculateFibonaci(number - 2);
        }
    }

    public int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += caculateFibonaci(i);
        }
        return sum;
    }
}
