public class Exercise3 {
    public boolean isPrimeNumber(int number){
        if(number < 2) {
            return false;
        }

        int root = (int)Math.sqrt(number);
           for(int i=2; i<=root; i++) {
               if(number % i == 0) {
                    return false;
                }
            }
        return true;
    }
    public String analysisPrimeNumber(int number){
        if(isPrimeNumber(number)){
            return String.valueOf(number);
        }
        String result="";
        int primeNumber=2;
        for(int j=0;j<number;j++){
            if (number % primeNumber == 0 ) {
                do {
                    number = number / primeNumber;
                    result += primeNumber + "*";
                } while (number % primeNumber == 0);
            } else {
                primeNumber++;
            }
        }
        result=result.substring(0,result.length()-1);
        return result;
    }
}
