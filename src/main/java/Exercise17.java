import java.util.ArrayList;
import java.util.List;

public class Exercise17 {
    public int countNumber(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public boolean isValidNumber(int number) {
        int countNumber = countNumber(number);
        int temp = number;
        int sum = 0;
        int surplus = 0;
        while (temp > 0) {
            surplus = temp % 10;
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
        for (Integer i : result) {
            System.out.print(i + ",");
        }
        return result;
    }

}
