public class Exercise1 {
    public int caculateGCD(int a,int b){
        if(a==0||b==0){
            return a+b;
        }
        while(a!=b){
            if(a<b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    public int caculateLGM(int a,int b){
       return a*b/(caculateGCD(a,b));
    }

}
