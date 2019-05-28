import java.util.ArrayList;
import java.util.List;

public class Array1 {
    public List<Integer> findDuplicateElement(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count == 2) {
                    result.add(arr[i]);
                    break;
                }
            }
        }
        return result;
    }
}
