public class Exercise24 {
    public int caculateFibonaci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } else {
            return caculateFibonaci(number - 1) + caculateFibonaci(number - 2);
        }
    }

    public int countFibonaciNumber(int number) {
        int result = 1;
        int FibonaciNumber = 1;
        while (FibonaciNumber <= number) {
            result++;
            FibonaciNumber = caculateFibonaci(result);
        }
        return result - 1;
    }
}
