public class Exercise4 {
    public String analysisPrimeNumber(int number){
        String result="";
        for(int temp=2;temp<number;temp++){
            int count=0;
            while (number % temp==0){
                count++;
                number=number/temp;
            }

            if(count!=0){
                result+=temp;
                if(count>1){
                    result+="^"+count;
                }
                if(number>1){
                    result+=" * ";
                }
            }
        }

        return result;
    }
}
