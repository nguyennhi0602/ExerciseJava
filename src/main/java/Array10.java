import java.util.ArrayList;
import java.util.List;

public class Array10 {
    public List<List<Integer>> minusArray(int[] arr, int n) {
        int mid = (int) Math.ceil((double) arr.length / n);
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
