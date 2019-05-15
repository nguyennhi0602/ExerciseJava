public class Exercise5 {
    public int caculateFibonaci(int number){
        if(number == 1 || number == 2){
            return 1;
        }else {
            return caculateFibonaci(number - 1) + caculateFibonaci(number - 2);
        }
    }
    public String listFibonaci(int number){
        if(number==1){
            return String.valueOf(0);
        }else {
            String result = "";
            int fibonaciNumber = 1;
            int calFibonaciNumber = 0;
            int nextFibonaciNumber = 0;
            while (nextFibonaciNumber < number) {
                calFibonaciNumber = caculateFibonaci(fibonaciNumber);
                nextFibonaciNumber = caculateFibonaci(fibonaciNumber + 1);
                result += calFibonaciNumber + " ";
                fibonaciNumber++;
            }
            result = result.trim();
            return result;
        }
    }
}
