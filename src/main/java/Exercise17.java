import java.util.ArrayList;
import java.util.List;

public class Exercise17 {

    public int countNumber(int number) {
        if (number == 0) {
            return 0;
        }
        return countNumber(number / 10) +1;
    }

    public boolean isValidNumber(int number) {
        int countNumber = countNumber(number);
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int surplus = temp % 10;
            temp /= 10;
            sum += Math.pow(surplus, countNumber);
        }
        return sum == number;
    }

    public List<Integer> getValidNumbers() {
        List<Integer> result = new ArrayList<>();
        for (int i = 10; i < 100000; i++) {
            if (isValidNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }

}
