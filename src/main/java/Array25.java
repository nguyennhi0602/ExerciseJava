public class Array25 {
    public int caculateGCD(int a, int b) {
        if (a == 0 || b == 0) {
            return (a + b);
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public int calculateGCDOfArray(int[] arr) {
        int result = caculateGCD(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            result = caculateGCD(result, arr[i]);
        }
        return result;
    }
}
