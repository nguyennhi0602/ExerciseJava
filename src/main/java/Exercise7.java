public class Exercise7 {
    public int calculateSum(int n){
        if(n==0){
            return 0;
        }
        return calculateSum(n-1)+n*(n+1);
    }

}
