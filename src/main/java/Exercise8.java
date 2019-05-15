public class Exercise8 {
    public int calculateFactorial(int number){
        if(number == 1){
            return 1;
        }
        return calculateFactorial(number-1)*number;
    }
}
