public class Exercise24 {
    public int caculateFibonaci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }
        int count = 2;
        int a0 = 1, a1 = 1, result = 2;
        while (count++ < number) {
            result = a0 + a1;
            a0 = a1;
            a1 = result;
        }
        return result;
    }

    public int countFibonaciNumber(int number) {
        int result = 0;
        while (caculateFibonaci(++result)<=number){
        }
        return result;
    }
}
