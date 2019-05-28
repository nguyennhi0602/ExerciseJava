import java.util.ArrayList;
import java.util.List;

public class Array5 {
    public boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> getArray(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
