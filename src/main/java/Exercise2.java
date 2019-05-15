public class Exercise2 {

    public int calculateSumOfNumber(int number){
        int sum=0;
            while (number > 0) {
                int surplus = number % 10;
                number = number / 10;
                sum += surplus;
            }
        return sum;
    }
}
