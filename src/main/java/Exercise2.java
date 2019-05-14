public class Exercise2 {
    public boolean isPrimeNumber(int number){
        if(number<2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
    public int calculateSumOfNumber(int number){
        int sum=0;
        if(!isPrimeNumber(number)){
            return 0;
        }else{
            while (number > 0) {
                int surplus = number % 10;
                number = number / 10;
                sum += surplus;
            }
        }
        return sum;
    }
}
