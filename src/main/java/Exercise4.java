public class Exercise4 {
    public String analysisPrimeNumber(int number) {
        if(number<2){
            return String.valueOf(number);
        }
        String result="";
        int temp=2;
        while(number>=temp){
            while (number % temp == 0 ) {
                number = number / temp;
                result += temp + "*";
            }
            temp++;
        }
        result=result.substring(0,result.length()-1);
        return result;
    }
}
