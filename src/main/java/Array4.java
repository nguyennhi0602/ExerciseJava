import java.util.ArrayList;
import java.util.List;

public class Array4 {
    public List<Integer> sortArray(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result.add(0, arr[i]);
            } else {
                result.add(result.size(), arr[i]);
            }
        }
        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = i + 1; j < result.size(); j++) {
                if (result.get(i) % 2 == 0 && result.get(j) % 2 == 0 && (result.get(i) > result.get(j))) {
                    int temp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, temp);
                }
                if (result.get(i) % 2 != 0 && result.get(j) % 2 != 0 && (result.get(i) < result.get(j))) {
                    int temp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, temp);
                }
            }
        }
        return result;
    }
}
