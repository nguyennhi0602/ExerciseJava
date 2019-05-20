import java.math.BigInteger;

public class Exercise27 {
    public int countZeroNumber(int number) {
        BigInteger temp = new BigInteger("1");
        for (int i = 1; i <= number; i++) {
            temp = temp.multiply(new BigInteger(""+i));
        }
        int count = 0;
        String str = temp.toString();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0') {
                count++;
            }
        }
        return count;
    }
}
