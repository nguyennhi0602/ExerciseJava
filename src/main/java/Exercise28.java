public class Exercise28 {
    public double calculateSquareOfNumber(double number) {
        if (number == 0) {
            return 0;
        }
        double result = number / 2;
        double temp = 0;
        do {
            temp = result;
            result = (temp + (number / temp)) / 2;
        } while (result - temp != 0);
        return result;
    }
}
