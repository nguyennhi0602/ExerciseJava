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
        int count=0;
        for(int j=0;j<number;j++){
            if ((number % primeNumber == 0) && (isPrimeNumber(primeNumber)) ) {
                do {
                    number = number / primeNumber;
                    count++;
                } while (number % primeNumber == 0);
                for (int i = 0; i < count; i++) {
                    result += primeNumber + "*";
                }

            } else {
                primeNumber++;
                count = 0;
            }
        }
        result=result.substring(0,result.length()-1);
        return result;
    }
}
