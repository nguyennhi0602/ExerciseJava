import java.util.ArrayList;
import java.util.List;

public class Array7 {

    public List<Integer> getArray(int[] arr) {
        int max = 0;
        int count = 0;
        int first = 0;
        int end = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
                if (count > max) {
                    max = count;
                    end = i + 1;
                    first = end - max;
                }
            } else {
                count = 0;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = first; i <= end; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
