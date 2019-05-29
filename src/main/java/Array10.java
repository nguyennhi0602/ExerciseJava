import java.util.ArrayList;
import java.util.List;

public class Array10 {
    public List<List<Integer>> minusArray(int[] arr, int n) {
        int mid = arr.length / n;
        if (arr.length % n != 0) {
            mid = (arr.length / n) + 1;
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            temp.add(arr[i]);
            if (temp.size() == mid) {
                result.add(temp);
                temp = new ArrayList<>();
            }
        }
        if (result.size() < n) {
            result.add(temp);
        }
        return result;
    }
}
