public class Exercise24 {
    public int countFibonaciNumber(int number) {
        if (number == 0) {
            return 0;
        }
        int firstNumber = 1;
        int sencondNumber = 1;
        int currentNumber = 2;
        int count = 1;
        while ((currentNumber <= number)) {
            currentNumber = firstNumber + sencondNumber;
            firstNumber = sencondNumber;
            sencondNumber = currentNumber;
            count++;
        }
        return count;
    }
}
